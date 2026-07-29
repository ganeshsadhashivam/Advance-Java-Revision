package com.kodewala.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kodewala.entity.OrderEntity;

@Repository
public interface OrderRepository extends CrudRepository<OrderEntity,Integer> {

//	public boolean orderSavedToRepository()
//	{
//		System.out.println("OrderRepository start");
//		
//		System.out.println("OrderRepository end");
//		return true;
//	}
}
