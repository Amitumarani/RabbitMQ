package com.order.service.order_service.configuration;

import java.util.function.Consumer;

import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderConfiguration {
	
   @Bean
   public Consumer<String> consumeAck(){
	   return (str) ->{
		   System.out.println(str);
	   };
   }
}
