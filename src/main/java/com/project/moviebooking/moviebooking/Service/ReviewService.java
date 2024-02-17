package com.project.moviebooking.moviebooking.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.moviebooking.moviebooking.Dao.ReviewDao;
import com.project.moviebooking.moviebooking.entity.Review;
import com.project.moviebooking.moviebooking.exceptionhandling.ReviewNotFound;
import com.project.moviebooking.moviebooking.util.ResponseStructure;

@Service
public class ReviewService {
	@Autowired
	ReviewDao reviewdao;
	public ResponseEntity<ResponseStructure<Review>> savereview(Review review){
		ResponseStructure <Review>structure=new ResponseStructure<Review>();
		Review l=reviewdao.savereview(review);
		if(l!=null) {
			structure.setMessage("save data ssuccessfully");
			structure.setStatus(HttpStatus.CREATED.value());
			structure.setData(l);
			return new ResponseEntity<ResponseStructure<Review>>(structure,HttpStatus.CREATED);
			//ResponseEntity<ResponseStructure<Review>>(structure,HttpStatus.CREATED);
		}
		 throw new ReviewNotFound("review not found");
		}
	public ResponseEntity<ResponseStructure<Review>> findreview(int reviewid){
		ResponseStructure <Review>structure=new ResponseStructure<Review>();
		Review l=reviewdao.findreview(reviewid);
		if(l!=null) {
			structure.setMessage("find data ssuccessfully");
			structure.setStatus(HttpStatus.FOUND.value());
			structure.setData(l);
			return new ResponseEntity<ResponseStructure<Review>>(structure,HttpStatus.FOUND);
			//ResponseEntity<ResponseStructure<Review>>(structure,HttpStatus.CREATED);
		}
		 throw  new ReviewNotFound("review not found");
		
	}
	public ResponseEntity<ResponseStructure<Review>> deletereview(int reviewid){
		ResponseStructure <Review>structure=new ResponseStructure<Review>();
		Review l=reviewdao.deletereview(reviewid);
		if(l!=null) {
			structure.setMessage("delete data ssuccessfully");
			structure.setStatus(HttpStatus.FOUND.value());
			structure.setData(l);
			return new ResponseEntity<ResponseStructure<Review>>(structure,HttpStatus.FOUND);
			//ResponseEntity<ResponseStructure<Review>>(structure,HttpStatus.CREATED);
		}
		 throw  new ReviewNotFound("review not found");
	}

	public ResponseEntity<ResponseStructure<Review>> updatereview(Review review,int reviewid){
		ResponseStructure <Review>structure=new ResponseStructure<Review>();
		Review l=reviewdao.updatereview(review, reviewid);
		if(l!=null) {
			structure.setMessage("update data ssuccessfully");
			structure.setStatus(HttpStatus.OK.value());
			structure.setData(l);
			return new ResponseEntity<ResponseStructure<Review>>(structure,HttpStatus.OK);
			//ResponseEntity<ResponseStructure<Review>>(structure,HttpStatus.CREATED);
		}
		 throw  new ReviewNotFound("review not found");
	}
}

