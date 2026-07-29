package com.irctc.booking.request;

public class TrainRequest {

    private String trainNumber;
    private String trainName;
    private String sourceStation;
    private String destinationStation;
    private Integer totalSeats;

    public TrainRequest() {
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public String getTrainName() {
        return trainName;
    }

    public String getSourceStation() {
        return sourceStation;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public Integer getTotalSeats() {
        return totalSeats;
    }
}
