package com.irctc.booking.response;

public class TrainResponse {

    private Long id;
    private String trainNumber;
    private String trainName;
    private String sourceStation;
    private String destinationStation;
    private Integer totalSeats;

    public TrainResponse() {
    }

    public Long getId() {
        return id;
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

    public void setId(Long id) {
        this.id = id;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public void setSourceStation(String sourceStation) {
        this.sourceStation = sourceStation;
    }

    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }

    public void setTotalSeats(Integer totalSeats) {
        this.totalSeats = totalSeats;
    }
}
