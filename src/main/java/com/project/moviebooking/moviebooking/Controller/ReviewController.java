package com.project.moviebooking.moviebooking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.moviebooking.moviebooking.Service.ReviewService;
import com.project.moviebooking.moviebooking.entity.Review;
@RestController
@RequestMapping("review")
public class ReviewController {
	@Autowired
	ReviewService reviewservice;
	@PostMapping
	public Review savereview(Review review) {
		return reviewservice.savereview(review);
		
	}
	@GetMapping
	public Review findservice(int  reviewid) {
		return reviewservice.findreview(reviewid);
	}
	@DeleteMapping
	public Review deletservice(int reviewid) {
		return reviewservice.deletereview(reviewid);
	}
	@PutMapping
	public Review updateservice(Review review,int reviewid) {
		return reviewservice.updatereview(review, reviewid);
	}

}
