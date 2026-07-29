package com.blinkit.auth.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blinkit.auth.entity.RoleEntity;



@Repository
public interface RoleRepository extends JpaRepository<RoleEntity,Long> {

	boolean existsByRoleName(String roleName);

	RoleEntity getRoleById(Long id);
	
	  Optional<RoleEntity> findByRoleName(String roleName);


//	RoleEntity findByRoleName(String string);

}
