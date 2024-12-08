package com.order.service.order_service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetail {
	
	private String orderId;
	
	private String email;
	
	private String userID;
	
	private String userPhone;
	
	private boolean orderPaymentStatus= false;
	
	private boolean orderStatus = false;
	
	private String courseId;

}
