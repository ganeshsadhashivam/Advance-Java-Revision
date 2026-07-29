package com.kodewala.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;

import com.kodewala.beans.PaymentLifeCycle;

@Configuration
public class SpringConfig {

	@Bean("PLifeCycle")
	@Scope("prototype")
	@Profile("dev")
	/*@Profile("dev")
	 * in run configuration we set VM arguments to -Dspring.profiles.active=dev so in this 
	 * Environment only the below Bean will be created in other 
	 *environment it won't be created 
	 */
	public PaymentLifeCycle createPayment()
	{
		PaymentLifeCycle p = new PaymentLifeCycle();
		p.setPaymentId("ID:lifecyclebeanlearning");
		return p;
	}
}
