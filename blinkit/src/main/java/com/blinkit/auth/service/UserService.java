package com.blinkit.auth.service;

import java.time.LocalDateTime;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blinkit.auth.entity.OtpEntity;
import com.blinkit.auth.entity.RoleEntity;
import com.blinkit.auth.entity.UserEntity;
import com.blinkit.auth.entity.UserRoleEntity;
import com.blinkit.auth.repository.OtpRepository;
import com.blinkit.auth.repository.RoleRepository;
import com.blinkit.auth.repository.UserRepository;
import com.blinkit.auth.request.SendOtpRequest;
import com.blinkit.auth.request.VerifyOtpRequest;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;

	@Autowired
    private OtpRepository otpRepository;

	public String sendOtp(SendOtpRequest request) {

	    // Check if user exists
	    UserEntity user = userRepository.findByMobile(request.getMobile()).orElse(null);

	    // Create new user if not found
	    if (user == null) {

	        RoleEntity customerRole = roleRepository
	                .findByRoleName("CUSTOMER").orElseThrow(() -> new RuntimeException("CUSTOMER role not found"));

	        user = new UserEntity();
	        user.setMobile(request.getMobile());

	        UserRoleEntity userRole = new UserRoleEntity();
	        userRole.setUser(user);
	        userRole.setRole(customerRole);

	        user.getUserRoles().add(userRole);
	        customerRole.getUserRoles().add(userRole);

	        user = userRepository.save(user);
	    }

	    // Generate OTP
	    String otp = generateOtp();

	    // Delete previous OTP
	    otpRepository.deleteByMobile(user.getMobile());

	    // Create OTP entity
	    OtpEntity otpEntity = new OtpEntity();
	    otpEntity.setMobile(user.getMobile());
	    System.out.println("Request Mobile : " + request.getMobile());
	    otpEntity.setOtp(otp);
	    otpEntity.setVerified(false);
	    otpEntity.setExpiryTime(LocalDateTime.now().plusMinutes(5));

	    // Save OTP
	    otpRepository.save(otpEntity);

	    // TODO: Send SMS using SMS provider

	    // Development only
	    System.out.println("--------------------------------");
	    System.out.println("Mobile : " + user.getMobile());
	    System.out.println("OTP    : " + otp);
	    System.out.println("--------------------------------");

	    return "OTP sent successfully.";
	}
	private String generateOtp() {
		
		Random random = new Random();
		
		int otp = 100000 + random.nextInt(900000);
		
		return String.valueOf(otp);
	}
	
	
	
	public String verifyOtp(VerifyOtpRequest request) {

	    OtpEntity otpEntity = otpRepository.findByMobile(request.getMobile())
	            .orElseThrow(() -> new RuntimeException("OTP not found"));
	    System.out.println("Saved Mobile : " + request.getMobile());
	    // Check expiry
	    if (otpEntity.getExpiryTime().isBefore(LocalDateTime.now())) {
	        throw new RuntimeException("OTP has expired");
	    }

	    // Check already verified
	    if (Boolean.TRUE.equals(otpEntity.getVerified())) {
	        throw new RuntimeException("OTP already used");
	    }

	    // Check OTP
	    if (!otpEntity.getOtp().equals(request.getOtp())) {
	        throw new RuntimeException("Invalid OTP");
	    }

	    // Mark verified
	    otpEntity.setVerified(true);

	    otpRepository.save(otpEntity);

	    return "OTP Verified Successfully";
	}


}



