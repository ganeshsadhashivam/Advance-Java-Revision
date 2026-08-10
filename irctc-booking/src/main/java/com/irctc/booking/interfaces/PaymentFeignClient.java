package com.irctc.booking.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.irctc.booking.dto.PaymentRequest;
import com.irctc.booking.dto.PaymentResponse;

@FeignClient(name="irctc-payment")
public interface PaymentFeignClient {

	@PostMapping("/payments/pay")
	PaymentResponse processPayment(@RequestBody PaymentRequest request);
}
