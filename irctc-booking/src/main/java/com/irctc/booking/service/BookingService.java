package com.irctc.booking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.irctc.booking.dto.BookingConfirmedEvent;
import com.irctc.booking.entity.BookingEntity;
import com.irctc.booking.entity.TrainEntity;
import com.irctc.booking.entity.UserEntity;
import com.irctc.booking.exception.SeatNotAvailableException;
import com.irctc.booking.kafka.producer.service.KafkaService;
import com.irctc.booking.repository.BookingRepository;
import com.irctc.booking.repository.TrainRepository;
import com.irctc.booking.repository.UserRepository;
import com.irctc.booking.request.BookingRequest;
import com.irctc.booking.response.BookingPageResponse;
import com.irctc.booking.response.BookingResponse;

@Service
public class BookingService {
	
	@Autowired
	BookingRepository bookingRepository;
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private TrainRepository trainRepository;
	
	@Autowired
	KafkaService kafkaService;
	
	/*
	 * for pagination 
	 */
	
	public BookingPageResponse getBookingsByUserId(Long userId, int page, int size) {

	    Pageable pageable = PageRequest.of(page, size);

	    Page<BookingEntity> bookingPage =  bookingRepository.findByUserId(userId, pageable);

	    List<BookingResponse> responses = new ArrayList<>();

	    for (BookingEntity booking : bookingPage.getContent()) {

	        BookingResponse response = new BookingResponse();

	        response.setId(booking.getId());
	        response.setPnrNumber(booking.getPnrNumber());

	        response.setUserId(booking.getUser().getId());
	        response.setUserName(booking.getUser().getName());

	        response.setTrainId(booking.getTrain().getId());
	        response.setTrainNumber(booking.getTrain().getTrainNumber());
	        response.setTrainName(booking.getTrain().getTrainName());

	        response.setJourneyDate(booking.getJourneyDate());
	        response.setFromStation(booking.getFromStation());
	        response.setToStation(booking.getToStation());

	        response.setPassengerCount(booking.getPassengerCount());
	        response.setTotalFare(booking.getTotalFare());

	        response.setTravelClass(booking.getTravelClass());
	        response.setBookingStatus(booking.getBookingStatus());
	        response.setPaymentStatus(booking.getPaymentStatus());

	        response.setCreatedAt(booking.getCreatedAt());

	        responses.add(response);
	    }

	    BookingPageResponse pageResponse = new BookingPageResponse();

	    pageResponse.setContent(responses);
	    pageResponse.setPage(bookingPage.getNumber());
	    pageResponse.setSize(bookingPage.getSize());
	    pageResponse.setTotalElements(bookingPage.getTotalElements());
	    pageResponse.setTotalPages(bookingPage.getTotalPages());
	    pageResponse.setLast(bookingPage.isLast());

	    return pageResponse;
	}
	
	
	/*
	 * without Pagination
	 */
	public List<BookingResponse> getBookingsByUserId(Long userId) {

	    List<BookingEntity> bookingEntities = bookingRepository.findByUserId(userId);

	    List<BookingResponse> responses = new ArrayList<>();

	    for (BookingEntity booking : bookingEntities) {

	        BookingResponse response = new BookingResponse();

	        response.setId(booking.getId());
	        response.setPnrNumber(booking.getPnrNumber());

	        response.setUserId(booking.getUser().getId());
	        response.setUserName(booking.getUser().getName());

	        response.setTrainId(booking.getTrain().getId());
	        response.setTrainNumber(booking.getTrain().getTrainNumber());
	        response.setTrainName(booking.getTrain().getTrainName());

	        response.setJourneyDate(booking.getJourneyDate());
	        response.setFromStation(booking.getFromStation());
	        response.setToStation(booking.getToStation());

	        response.setPassengerCount(booking.getPassengerCount());
	        response.setTotalFare(booking.getTotalFare());

	        response.setTravelClass(booking.getTravelClass());
	        response.setBookingStatus(booking.getBookingStatus());
	        response.setPaymentStatus(booking.getPaymentStatus());

	        response.setCreatedAt(booking.getCreatedAt());

	        responses.add(response);
	    }

	    return responses;
	}

	@Transactional
	public BookingResponse doBooking(BookingRequest bookingRequest)
	{
		
		BookingEntity bookingEntity = new BookingEntity();

		bookingEntity.setPnrNumber(bookingRequest.getPnrNumber());
		bookingEntity.setJourneyDate(bookingRequest.getJourneyDate());
		bookingEntity.setFromStation(bookingRequest.getFromStation());
		bookingEntity.setToStation(bookingRequest.getToStation());
		bookingEntity.setPassengerCount(bookingRequest.getPassengerCount());
		bookingEntity.setTotalFare(bookingRequest.getTotalFare());
		bookingEntity.setTravelClass(bookingRequest.getTravelClass());
		bookingEntity.setBookingStatus(bookingRequest.getBookingStatus());
		bookingEntity.setPaymentStatus(bookingRequest.getPaymentStatus());

		// Set UserEntity
		UserEntity user = userRepository.findById(bookingRequest.getUserId())
		        .orElseThrow(() -> new RuntimeException("User not found"));
		bookingEntity.setUser(user);

		// Set TrainEntity
		TrainEntity train = trainRepository.findById(bookingRequest.getTrainId())
		        .orElseThrow(() -> new RuntimeException("Train not found"));
		bookingEntity.setTrain(train);
		
		
		if (train.getAvailableSeats() < bookingRequest.getPassengerCount()) {
			throw new SeatNotAvailableException("Seats not available");
		}
		
		train.setAvailableSeats(
		        train.getAvailableSeats() - bookingRequest.getPassengerCount());

		trainRepository.save(train);

		// Save Booking
		BookingEntity savedBooking = bookingRepository.save(bookingEntity);
		
		
		//Send Events to Kafka for Notification.
		BookingConfirmedEvent event = new BookingConfirmedEvent();

		event.setBookingId(savedBooking.getId());
		event.setPnrNumber(savedBooking.getPnrNumber());

		event.setUserId(savedBooking.getUser().getId());
		event.setUserName(savedBooking.getUser().getName());

		event.setTrainId(savedBooking.getTrain().getId());
		event.setTrainNumber(savedBooking.getTrain().getTrainNumber());
		event.setTrainName(savedBooking.getTrain().getTrainName());

		event.setJourneyDate(savedBooking.getJourneyDate());
		event.setFromStation(savedBooking.getFromStation());
		event.setToStation(savedBooking.getToStation());

		event.setPassengerCount(savedBooking.getPassengerCount());
		event.setTotalFare(savedBooking.getTotalFare());

		event.setTravelClass(savedBooking.getTravelClass().name());
		event.setBookingStatus(savedBooking.getBookingStatus().name());
		event.setPaymentStatus(savedBooking.getPaymentStatus().name());

		event.setBookedAt(savedBooking.getCreatedAt());
		

			kafkaService.publishMessage("booking-confirmed", event);
			System.out.println("Event Published to Kafka....");

		
		// Construct Response
		BookingResponse response = new BookingResponse();

		response.setId(savedBooking.getId());
		response.setPnrNumber(savedBooking.getPnrNumber());

		response.setUserId(savedBooking.getUser().getId());
		response.setUserName(savedBooking.getUser().getName());

		response.setTrainId(savedBooking.getTrain().getId());
		response.setTrainNumber(savedBooking.getTrain().getTrainNumber());
		response.setTrainName(savedBooking.getTrain().getTrainName());

		response.setTravelClass(savedBooking.getTravelClass());
		response.setJourneyDate(savedBooking.getJourneyDate());
		response.setFromStation(savedBooking.getFromStation());
		response.setToStation(savedBooking.getToStation());

		response.setPassengerCount(savedBooking.getPassengerCount());
		response.setTotalFare(savedBooking.getTotalFare());

		response.setBookingStatus(savedBooking.getBookingStatus());
		response.setPaymentStatus(savedBooking.getPaymentStatus());

		response.setCreatedAt(savedBooking.getCreatedAt());
		
		return response;

	}
}
