package com.kodewala.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.kodewala.bean.Payment;

@Configuration
public class SpringConfig {

	
	@Bean("Payment")
//	@Scope("prototype")
	public Payment createPayment()
	{
		Payment p = new Payment();
		p.setPaymentReference("gash3256feg");
		return p;
		
	}
}
