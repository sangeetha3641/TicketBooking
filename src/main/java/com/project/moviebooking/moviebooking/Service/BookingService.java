package com.project.moviebooking.moviebooking.Service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.moviebooking.moviebooking.Dao.BookingDao;
import com.project.moviebooking.moviebooking.entity.Booking;
import com.project.moviebooking.moviebooking.util.ResponseStructure;

@Service
public class BookingService {
	BookingDao bookingdao;
	public Booking savebooking(Booking booking) {
		return bookingdao.savebooking(booking);
	}
	public Booking findbooking(int bookingid) {
		return bookingdao.findbooking(bookingid);
		
	}
	public Booking deletebooking(int bookingid) {
		return bookingdao.deletebooking(bookingid);
	}
	public Booking updatbooking(Booking booking,int bookingid) {
		return bookingdao.updatebooking(booking, bookingid);
	}

}
