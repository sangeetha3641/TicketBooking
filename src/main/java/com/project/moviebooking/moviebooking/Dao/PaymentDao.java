package com.project.moviebooking.moviebooking.Dao;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.moviebooking.moviebooking.entity.Payment;
import com.project.moviebooking.moviebooking.repo.PaymentRepo;

@Service
public class PaymentDao {
	@Autowired
	PaymentRepo paymentrepo;
	
	
	
	public Payment savepayment(Payment payment) {
		return paymentrepo.save(payment);
		
	}
	
	public Payment findpayment(int paymentId)
	{
		java.util.Optional<Payment> a=paymentrepo.findById(paymentId);
		if(a.isPresent())
		{
			return a.get();
		}
		return null;
	}

	public Payment deletepayment(int paymentId)
	{
		Payment a=findpayment(paymentId);
		paymentrepo.delete(a);
	    return a;
		
	}
	
	public Payment updatepayment(Payment payment, int paymentId)
	{
		Payment expayment= findpayment(paymentId);
		if(expayment != null)
		{
			payment.setPayment(paymentId);
			return paymentrepo.save(payment);
		}
		return null;
	}
	
	public List<Payment> findAllPayment(List<Payment> payment)
	{
		
		List<Payment> expayment =paymentrepo.findAll();
		return expayment;
	}

}
