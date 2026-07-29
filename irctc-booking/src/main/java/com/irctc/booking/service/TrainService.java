package com.irctc.booking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irctc.booking.entity.TrainEntity;
import com.irctc.booking.repository.TrainRepository;
import com.irctc.booking.request.TrainRequest;
import com.irctc.booking.response.TrainResponse;

@Service
public class TrainService {

    @Autowired
    private TrainRepository trainRepository;

    public TrainResponse createTrain(TrainRequest request) {

        TrainEntity train = new TrainEntity();

        train.setTrainNumber(request.getTrainNumber());
        train.setTrainName(request.getTrainName());
        train.setSourceStation(request.getSourceStation());
        train.setDestinationStation(request.getDestinationStation());
        train.setTotalSeats(request.getTotalSeats());
        train.setTotalSeats(request.getTotalSeats());
        train.setAvailableSeats(request.getTotalSeats());

        TrainEntity savedTrain = trainRepository.save(train);

        TrainResponse response = new TrainResponse();

        response.setId(savedTrain.getId());
        response.setTrainNumber(savedTrain.getTrainNumber());
        response.setTrainName(savedTrain.getTrainName());
        response.setSourceStation(savedTrain.getSourceStation());
        response.setDestinationStation(savedTrain.getDestinationStation());
        response.setTotalSeats(savedTrain.getTotalSeats());

        return response;
    }

}