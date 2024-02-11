package com.project.moviebooking.moviebooking.Dao;

import java.util.Optional;

import com.project.moviebooking.moviebooking.entity.Booking;
import com.project.moviebooking.moviebooking.repo.Bookingrepo;

public class BookingDao {
	Bookingrepo bookingrepo;
	public Booking savebooking(Booking booking) {
		bookingrepo.save(booking);
		return booking;
		
	}
	public Booking findbooking (int  BookingId) {
		Optional <Booking>p=bookingrepo.findById( BookingId);
		if(p.isPresent()==true) {
			return p.get();
		}
		return null;
		
		
	}
	public Booking deletebooking(int BookingId) {
		Booking booking=findbooking(BookingId);
		if(booking!=null) {
			bookingrepo.delete(booking);
			return booking;
		}
		return null;
	}
	public  Booking updatebooking(Booking booking, int BookingId) {
		Booking exbooking =findbooking(BookingId);
		if(exbooking!=null) {
			booking.setBookingid(BookingId);
			return bookingrepo.save(booking);
			
		}
		return null;
		
	}
	

}
