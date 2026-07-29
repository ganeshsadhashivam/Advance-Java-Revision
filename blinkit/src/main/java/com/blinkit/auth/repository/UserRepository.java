package com.blinkit.auth.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blinkit.auth.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {

	   Optional<UserEntity> findByMobile(String mobile);

	    boolean existsByMobile(String mobile);
}
