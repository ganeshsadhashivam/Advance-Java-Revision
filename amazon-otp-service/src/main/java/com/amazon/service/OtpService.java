package com.amazon.service;

import java.security.SecureRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.entity.OtpEntity;
import com.amazon.repository.OtpRepository;
import com.amazon.response.OtpResponse;

@Service
public class OtpService {

	@Autowired
	OtpRepository otpRepository;
	
	public OtpResponse saveOtp(String name,String mobile)
	{
		OtpEntity otpEntity = new OtpEntity();
		otpEntity.setOtp(generateOtp());
		
		otpEntity.setStatus("Active");
		
		otpEntity.setName(name);
		
		otpEntity.setMobile(mobile);
		
		 OtpEntity  response =otpRepository.save(otpEntity);
		 if(response.getId() > 0)
		 {
			 System.out.println("Otp saved SuccessFully");
		 }
		 else
		 {
			 System.out.println("unable to save otp");
		 }
		 OtpResponse otpResponse = new OtpResponse();
		 otpResponse.setOtp(response.getOtp());
		 otpResponse.setStatus(response.getStatus());
		 otpResponse.setValid("5 mins");
		 return otpResponse ;
	}
	
	
	private int generateOtp()
	{
		 SecureRandom random = new SecureRandom();
	        int otp = 100000 + random.nextInt(900000); // Generates a number between 100000 and 999999
	        System.out.println(" generated otp " + otp);
	        return otp;
	        
	}
}
