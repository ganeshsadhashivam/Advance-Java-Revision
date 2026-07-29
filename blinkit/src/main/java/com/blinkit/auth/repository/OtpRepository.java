package com.blinkit.auth.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blinkit.auth.entity.OtpEntity;

public interface OtpRepository extends JpaRepository<OtpEntity,Long> {

	 Optional<OtpEntity> findByMobile(String mobile);

	    void deleteByMobile(String mobile);
}
