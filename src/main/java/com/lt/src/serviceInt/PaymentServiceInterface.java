package com.lt.src.serviceInt;



import java.util.UUID;

public interface PaymentServiceInterface {

	
	void paymentOption(UUID userId,double amount);
	void cashPayment(UUID userId,double amount);
	void chequePayment(UUID userId,double amount);
//	void scholarship();
}
