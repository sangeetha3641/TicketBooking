package com.project.moviebooking.moviebooking.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Component
public class Payment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int paymentid;
	private Double paymentprice;
	public int getPayment() {
		return paymentid;
	}
	public void setPayment(int paymentid) {
		this.paymentid = paymentid;
	}
	public Double getPaymentprice() {
		return paymentprice;
	}
	public void setPaymentprice(Double paymentprice) {
		this.paymentprice = paymentprice;
	}
	@Override
	public String toString() {
		return "Payment [payment=" + paymentid + ", paymentprice=" + paymentprice + "]";
	}

}
