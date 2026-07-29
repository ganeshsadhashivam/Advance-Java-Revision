package com.blinkit.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blinkit.auth.service.UserService;

import jakarta.transaction.Transactional;

import com.blinkit.auth.request.SendOtpRequest;
import com.blinkit.auth.request.VerifyOtpRequest;
@RestController
@RequestMapping("/api/auth")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/send-otp")
    @Transactional
    public ResponseEntity<String> sendOtp(@RequestBody SendOtpRequest request) {

        String response = userService.sendOtp(request);

        return ResponseEntity.ok(response);
    }

    @PostMapping("/verify-otp")
    public ResponseEntity<String> verifyOtp(@RequestBody VerifyOtpRequest request){

        return ResponseEntity.ok(userService.verifyOtp(request));
    }
}