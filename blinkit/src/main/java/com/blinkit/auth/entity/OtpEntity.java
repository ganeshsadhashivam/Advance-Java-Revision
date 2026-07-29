package com.blinkit.auth.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="otp_verification")
public class OtpEntity {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String mobile;

	    private String otp;

	    private LocalDateTime expiryTime;

	    private Boolean verified;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getOtp() {
			return otp;
		}

		public void setOtp(String otp) {
			this.otp = otp;
		}

		public LocalDateTime getExpiryTime() {
			return expiryTime;
		}

		public void setExpiryTime(LocalDateTime expiryTime) {
			this.expiryTime = expiryTime;
		}

		public Boolean getVerified() {
			return verified;
		}

		public void setVerified(Boolean verified) {
			this.verified = verified;
		}
	    
	    
}
