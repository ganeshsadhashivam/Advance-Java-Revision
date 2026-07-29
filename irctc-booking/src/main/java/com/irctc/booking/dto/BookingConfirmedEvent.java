package com.irctc.booking.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class BookingConfirmedEvent {

	    private Long bookingId;
	    private String pnrNumber;

	    private Long userId;
	    private String userName;

	    private Long trainId;
	    private String trainNumber;
	    private String trainName;

	    private LocalDateTime journeyDate;
	    private String fromStation;
	    private String toStation;

	    private Integer passengerCount;
	    private BigDecimal totalFare;

	    private String travelClass;
	    private String bookingStatus;
	    private String paymentStatus;

	    private LocalDateTime bookedAt;

		public Long getBookingId() {
			return bookingId;
		}

		public void setBookingId(Long bookingId) {
			this.bookingId = bookingId;
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

		public String getTravelClass() {
			return travelClass;
		}

		public void setTravelClass(String travelClass) {
			this.travelClass = travelClass;
		}

		public String getBookingStatus() {
			return bookingStatus;
		}

		public void setBookingStatus(String bookingStatus) {
			this.bookingStatus = bookingStatus;
		}

		public String getPaymentStatus() {
			return paymentStatus;
		}

		public void setPaymentStatus(String paymentStatus) {
			this.paymentStatus = paymentStatus;
		}

		public LocalDateTime getBookedAt() {
			return bookedAt;
		}

		public void setBookedAt(LocalDateTime bookedAt) {
			this.bookedAt = bookedAt;
		}

		
	    
}
