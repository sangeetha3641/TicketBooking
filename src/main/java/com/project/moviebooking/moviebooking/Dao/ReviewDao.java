package com.project.moviebooking.moviebooking.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.project.moviebooking.moviebooking.entity.Review;
import com.project.moviebooking.moviebooking.repo.ReviewRepo;
@Repository
public class ReviewDao {
	ReviewRepo reviewrepo;
	public Review savereview(Review r) {
		return reviewrepo.save(r);
	}
	public Review findreview(int reviewid) {
		Optional<Review> m=reviewrepo.findById(reviewid);
		if(m.isPresent()) {
			return m.get();
		}
		return null;
		
	}
	public Review deletereview(int movieid) {
		Review m=findreview(movieid);
			if(m!=null) {
				reviewrepo.delete(m);
				
			}
			return null;
		}
   public Review updatereview(Review m,int reviewid) {
	   Review m1=findreview(reviewid);
	   if(m1!=null) {
		   m1.setReviewId(reviewid);;
		   reviewrepo.save(m1);
	   }
	   return null;
   }
   public List<Review> findall() {
	   return reviewrepo.findAll();
   }
	   
		
	}
	
