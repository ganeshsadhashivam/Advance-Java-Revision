package com.irctc.booking.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.irctc.booking.request.BookingRequest;
import com.irctc.booking.response.BookingPageResponse;
import com.irctc.booking.response.BookingResponse;
import com.irctc.booking.service.BookingService;

@RestController
@RequestMapping("/irctc/booking/")
public class BookingController {

	@Autowired
	BookingService bookingService;
	
	
	
	@GetMapping("/user/{userId}")
	public ResponseEntity<BookingPageResponse> getBookingsByUserId(
	        @PathVariable Long userId,
	        @RequestParam(defaultValue = "0") int page,
	        @RequestParam(defaultValue = "5") int size) {

	    BookingPageResponse response =
	            bookingService.getBookingsByUserId(userId, page, size);

	    return ResponseEntity.ok(response);
	}
	
	/*
	 * 
	@GetMapping("/user/{userId}")
	public ResponseEntity<List<BookingResponse>> getBookingsByUserId(
	        @PathVariable Long userId) {

	    List<BookingResponse> response =
	            bookingService.getBookingsByUserId(userId);

	    return ResponseEntity.ok(response);
	}
	 */
	
	@PostMapping("confirmticket")
	public BookingResponse bookingService(@RequestBody BookingRequest bookingRequest)
	{
		return bookingService.doBooking(bookingRequest);
	}
}
