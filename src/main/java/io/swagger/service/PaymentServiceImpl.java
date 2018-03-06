package io.swagger.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Override
	public String getPaymentStatus() {
		// TODO Auto-generated method stub
		return "PENDING";
	}

	@Override
	public String cancelPayment() {
		// TODO Auto-generated method stub
		return "CANCELLED";
	}

	@Override
	public String savePayment() {
		// TODO Auto-generated method stub
		return "SUCCESS";
	}

	@Override
	public String updatePayment() {
		// TODO Auto-generated method stub
		return "UPDATED SUCCESSFULLY";
	}

}
