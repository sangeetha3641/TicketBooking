package com.project.moviebooking.moviebooking.entity;

import org.springframework.stereotype.Component;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Component
public class Review {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int reviewId;
	private String review;
	private int rating;
	public int getReviewId() {
		return reviewId;
	}
	public void setReviewId(int reviewId) {
		reviewId = reviewId;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	@Override
	public String toString() {
		return "Review [ReviewId=" + reviewId + ", review=" + review + ", rating=" + rating + "]";
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

	
}
