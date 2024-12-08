package com.notification.service.notification_service.configuration;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestBody;

import com.notification.service.notification_service.dto.OrderDetail;

@Configuration
public class NoticeConfiguartion {
	
	@Bean
	public Supplier<String> testing(){
		return ()-> "This is testing";
	}
	

	@Bean
	public Consumer<String> testing2(){
		return (value)-> System.out.println(value);
	}
	
	@Bean
	public Function<String,String> testing3(){
		return (value1)-> value1;
	}
	
	@Bean 
	public Function<OrderDetail,String> orderEventReceiver(){
		return (orderDetail)->{
			System.out.println(orderDetail.getEmail());
			System.out.println(orderDetail.getUserPhone());
			return "order notification sent to user";
		};
	}


}
