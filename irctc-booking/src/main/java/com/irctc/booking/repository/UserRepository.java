package com.irctc.booking.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.irctc.booking.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {

	

}
