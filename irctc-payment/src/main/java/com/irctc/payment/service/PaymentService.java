package com.irctc.payment.service;


import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.irctc.payment.dto.request.PaymentRequest;
import com.irctc.payment.dto.response.PaymentResponse;
import com.irctc.payment.entity.PaymentEntity;
import com.irctc.payment.enums.PaymentStatus;
import com.irctc.payment.repository.PaymentRepository;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public PaymentResponse processPayment(PaymentRequest paymentRequest) {

        PaymentEntity paymentEntity = new PaymentEntity();

        paymentEntity.setBookingId(paymentRequest.getBookingId());
        paymentEntity.setPnrNumber(paymentRequest.getPnrNumber());
        paymentEntity.setAmount(paymentRequest.getAmount());
        paymentEntity.setPaymentMode(paymentRequest.getPaymentMode());

        // Generate Transaction Id
        String transactionId = "TXN-" + UUID.randomUUID().toString().substring(0, 8);
        paymentEntity.setTransactionId(transactionId);

        // Simulate Payment Processing
        boolean success = new Random().nextBoolean();

        if (success) {
            paymentEntity.setPaymentStatus(PaymentStatus.SUCCESS);
        } else {
            paymentEntity.setPaymentStatus(PaymentStatus.FAILED);
        }

        paymentEntity.setPaymentTime(LocalDateTime.now());

        // Save Payment
        PaymentEntity savedPayment = paymentRepository.save(paymentEntity);

        // Prepare Response
        PaymentResponse response = new PaymentResponse();
        response.setTransactionId(savedPayment.getTransactionId());
        response.setPaymentStatus(savedPayment.getPaymentStatus());

        if (savedPayment.getPaymentStatus() == PaymentStatus.SUCCESS) {
            response.setMessage("Payment completed successfully.");
        } else {
            response.setMessage("Payment failed.");
        }

        return response;
    }

}