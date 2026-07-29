package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.revision.kodewala.pojo.KodeWalaAcademy;

@Configuration
public class SpringConfig {

	@Bean
	public KodeWalaAcademy createObjOfKw()
	{
		KodeWalaAcademy kw = new KodeWalaAcademy("g", 2017,20000.00d,7000.00d);
		
		
		return kw;
	}
}
