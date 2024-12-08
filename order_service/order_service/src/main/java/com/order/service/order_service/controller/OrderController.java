package com.order.service.order_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.service.order_service.dto.OrderDetail;
import com.order.service.order_service.service.OrderService;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private StreamBridge streamBridge;
	
	@PostMapping
	public ResponseEntity<?> createOrder(){
		OrderDetail orderDetail = orderService.createOrder();
		orderCreatedNotification(orderDetail);
		return ResponseEntity.ok("Order Created");
	}

	private void orderCreatedNotification(OrderDetail orderDetail) {
		boolean sentstatus = streamBridge.send("orderCreatedEvent-out-0", orderDetail);	
		if(sentstatus) {
			System.out.println("Notification sent to rabitMQ");
		}else {
			System.out.println("Notification not sent to rabitMQ");
		}
	}

}
