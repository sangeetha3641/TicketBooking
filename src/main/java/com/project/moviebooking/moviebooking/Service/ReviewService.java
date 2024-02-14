package com.project.moviebooking.moviebooking.Service;

import org.springframework.stereotype.Service;

import com.project.moviebooking.moviebooking.Dao.ReviewDao;
import com.project.moviebooking.moviebooking.entity.Review;

@Service
public class ReviewService {
	ReviewDao reviewdao;
	public Review savereview(Review review) {
		return reviewdao.savereview(review);
		
	}
	public Review findreview(int reviewid) {
		return reviewdao.findreview(reviewid);
	}
	public Review deletereview(int reviewid) {
		return reviewdao.deletereview(reviewid);
		
	}
	public Review updatereview(Review review,int reviewid) {
		return reviewdao.updatereview(review, reviewid);
	}
	
	

}
