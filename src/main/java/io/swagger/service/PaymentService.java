package io.swagger.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public interface PaymentService {
	
	public String getPaymentStatus();
	public String cancelPayment();
	public String savePayment();
	public String updatePayment();
	

}
