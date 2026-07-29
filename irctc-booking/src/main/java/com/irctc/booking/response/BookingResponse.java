package com.irctc.booking.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.irctc.booking.enums.BookingStatus;
import com.irctc.booking.enums.PaymentStatus;
import com.irctc.booking.enums.TravelClass;

public class BookingResponse {

    private Long id;

    private String pnrNumber;

    private Long userId;

    private String userName;

    private Long trainId;

    private String trainNumber;

    private String trainName;

    private TravelClass travelClass;

    private LocalDateTime journeyDate;

    private String fromStation;

    private String toStation;

    private Integer passengerCount;

    private BigDecimal totalFare;

    private BookingStatus bookingStatus;

    private PaymentStatus paymentStatus;

    private LocalDateTime createdAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPnrNumber() {
		return pnrNumber;
	}

	public void setPnrNumber(String pnrNumber) {
		this.pnrNumber = pnrNumber;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getTrainId() {
		return trainId;
	}

	public void setTrainId(Long trainId) {
		this.trainId = trainId;
	}

	public String getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public TravelClass getTravelClass() {
		return travelClass;
	}

	public void setTravelClass(TravelClass travelClass) {
		this.travelClass = travelClass;
	}

	public LocalDateTime getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(LocalDateTime journeyDate) {
		this.journeyDate = journeyDate;
	}

	public String getFromStation() {
		return fromStation;
	}

	public void setFromStation(String fromStation) {
		this.fromStation = fromStation;
	}

	public String getToStation() {
		return toStation;
	}

	public void setToStation(String toStation) {
		this.toStation = toStation;
	}

	public Integer getPassengerCount() {
		return passengerCount;
	}

	public void setPassengerCount(Integer passengerCount) {
		this.passengerCount = passengerCount;
	}

	public BigDecimal getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(BigDecimal totalFare) {
		this.totalFare = totalFare;
	}

	public BookingStatus getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(BookingStatus bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
    
    
}