package com.irctc.booking.service;

import org.springframework.stereotype.Service;

import com.irctc.booking.dto.PaymentRequest;
import com.irctc.booking.dto.PaymentResponse;
import com.irctc.booking.interfaces.PaymentFeignClient;
import com.irctc.booking.exception.PaymentServiceUnavailableException;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class PaymentServiceClient {

    private final PaymentFeignClient paymentFeignClient;

    public PaymentServiceClient(PaymentFeignClient paymentFeignClient) {
        this.paymentFeignClient = paymentFeignClient;
    }

    @CircuitBreaker(
            name = "paymentService",
            fallbackMethod = "paymentFallback"
    )
    public PaymentResponse processPayment(
            PaymentRequest paymentRequest) {

        return paymentFeignClient.processPayment(paymentRequest);
    }

    public PaymentResponse paymentFallback(
            PaymentRequest paymentRequest,
            Throwable throwable) {

        System.out.println(
                "Payment Service unavailable: "
                + throwable.getMessage()
        );

        throw new PaymentServiceUnavailableException(
                "Payment service is currently unavailable. "
                + "Please try again later."
        );
    }
}