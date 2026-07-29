package com.irctc.booking.exception;

public class SeatNotAvailableException extends RuntimeException {

	public SeatNotAvailableException(String message)
	{
		super(message);
	}
}
