package com.irctc.booking.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.irctc.booking.entity.BookingEntity;

@Repository
public interface BookingRepository extends JpaRepository<BookingEntity,Long> {

	List<BookingEntity> findByUserId(Long userId);
	
	/*
	 * for Pagination 
	 */
	
	Page<BookingEntity> findByUserId(Long userId, Pageable pageable);
}
