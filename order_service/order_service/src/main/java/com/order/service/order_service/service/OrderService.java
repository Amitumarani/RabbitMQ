package com.order.service.order_service.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.order.service.order_service.dto.OrderDetail;

@Service
public class OrderService {
	
	public OrderDetail createOrder() {
		OrderDetail orderDetail = new OrderDetail();
		orderDetail.setOrderId(UUID.randomUUID().toString());
		orderDetail.setEmail("amit@gamil");
		orderDetail.setUserPhone("7026957160");
		orderDetail.setUserID("23456");
		orderDetail.setCourseId(UUID.randomUUID().toString());
		return orderDetail;
	}
}
