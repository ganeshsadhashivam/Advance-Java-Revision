package com.kodewala;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderDetailsController {

	@GetMapping("/details/{orderId}/{customerId}")
	@ResponseBody
	public String getOrderDetails(@PathVariable("orderId") String orderId , @PathVariable("customerId") String customerId)
	{
		System.out.println("orderID :" + orderId);
		System.out.println("customerId : " + customerId);
		return "your order details are" + orderId + customerId;
	}
}
