package com.irctc.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.irctc.payment.entity.PaymentEntity;

public interface PaymentRepository extends JpaRepository<PaymentEntity,Long> {

}
