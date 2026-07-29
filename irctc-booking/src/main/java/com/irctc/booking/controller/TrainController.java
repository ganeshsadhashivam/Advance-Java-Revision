package com.irctc.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irctc.booking.request.TrainRequest;
import com.irctc.booking.response.TrainResponse;
import com.irctc.booking.service.TrainService;

@RestController
@RequestMapping("/trains")
public class TrainController {

    @Autowired
    private TrainService trainService;

    @PostMapping
    public ResponseEntity<TrainResponse> createTrain(@RequestBody TrainRequest request) {

        TrainResponse response = trainService.createTrain(request);

        return ResponseEntity.ok(response);
    }

}