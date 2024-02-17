package com.project.moviebooking.moviebooking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.moviebooking.moviebooking.Service.ReviewService;
import com.project.moviebooking.moviebooking.entity.Review;
import com.project.moviebooking.moviebooking.util.ResponseStructure;
@RestController
@RequestMapping("review")
public class ReviewController {
	@Autowired
	ReviewService reviewservice;
	@PostMapping
	public ResponseEntity<ResponseStructure<Review>> savereview(@RequestBody Review review) {
		return reviewservice.savereview(review);
		
	}
	@GetMapping
	public ResponseEntity<ResponseStructure<Review>> findservice(@RequestParam int  reviewid) {
		return reviewservice.findreview(reviewid);
	}
	@DeleteMapping
	public ResponseEntity<ResponseStructure<Review>> deletservice(@RequestParam int reviewid) {
		return reviewservice.deletereview(reviewid);
	}
	@PutMapping
	public ResponseEntity<ResponseStructure<Review>> updateservice(@RequestBody Review review,@RequestParam int  reviewid) {
		return reviewservice.updatereview(review, reviewid);
	}

}
