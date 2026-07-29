package com.kodewala.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kodewala.request.OrderRequest;
import com.kodewala.service.OrderService;

@Controller
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@PostMapping("order")
	public String handleOrder(@ModelAttribute OrderRequest orderRequest)
	{
		
		
		
		System.out.println(orderRequest.getOrderItem());
		System.out.println(orderRequest.getQuantity());
		System.out.println(orderRequest.getPrice());
		orderService.orderServiceOperations(orderRequest);
		
		return "order-success";
		
		
		
	}
}
