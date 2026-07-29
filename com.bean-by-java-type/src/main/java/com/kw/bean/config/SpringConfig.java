package com.kw.bean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kw.account.pojo.SavingsAccount;

@Configuration
public class SpringConfig {

	@Bean("sa")
	public SavingsAccount createSavingsAccount()
	{
		SavingsAccount sa = new SavingsAccount("gash", "993053994", 994411, "savings", 500.0);
		return sa;
	}
	
	@Bean("ca")
	public SavingsAccount createCurrentAccount()
	{
		SavingsAccount ca = new SavingsAccount("gash", "993053994", 994411, "current", 5000.0);
		return ca;
	}
}
