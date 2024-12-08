package com.order.service.order_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OrderServiceApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

}
