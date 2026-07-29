package com.kodewala.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewala.entity.OrderEntity;
import com.kodewala.repository.OrderRepository;
import com.kodewala.request.OrderRequest;

import jakarta.persistence.Column;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;
	
	public String orderServiceOperations(OrderRequest orderRequest)
	{
		
		System.out.println("perform order service operations start");
		System.out.println(orderRequest.getOrderItem());
		System.out.println(orderRequest.getQuantity());
		System.out.println(orderRequest.getPrice());
		System.out.println("perform order service operations End");

		OrderEntity entity = new OrderEntity();
		
		entity.setItemName(orderRequest.getOrderItem());
		entity.setQty(orderRequest.getQuantity());
		entity.setPrice(orderRequest.getPrice());
		//this will create a record in Orders table
		orderRepository.save(entity);
		
		
		//		orderRepository.orderSavedToRepository();
		
		return "";
	}
}
