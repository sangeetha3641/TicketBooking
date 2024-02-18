package com.project.moviebooking.moviebooking.Service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.moviebooking.moviebooking.Dao.MovieDao;
import com.project.moviebooking.moviebooking.Dao.SeatDao;
import com.project.moviebooking.moviebooking.Dto.AdminDto;
import com.project.moviebooking.moviebooking.Dto.MovieDto;
import com.project.moviebooking.moviebooking.entity.Movie;
import com.project.moviebooking.moviebooking.entity.Review;
import com.project.moviebooking.moviebooking.entity.Seat;
import com.project.moviebooking.moviebooking.entity.SeatType;
import com.project.moviebooking.moviebooking.exceptionhandling.AdminNotfound;
import com.project.moviebooking.moviebooking.exceptionhandling.Movienotfound;
import com.project.moviebooking.moviebooking.exceptionhandling.ReviewNotFound;
import com.project.moviebooking.moviebooking.exceptionhandling.SeatNotFound;
import com.project.moviebooking.moviebooking.repo.ReviewRepo;
import com.project.moviebooking.moviebooking.util.ResponseStructure;

@Service
public class MovieService {
	@Autowired
	MovieDao moviedao;
	@Autowired
	ReviewRepo reviewrepo;
	public ResponseEntity<ResponseStructure<MovieDto>>savemovie(Movie movie){
		MovieDto mdto=new MovieDto();
		ModelMapper mp=new ModelMapper();
		mp.map(moviedao.savemovie(movie),mdto );
		ResponseStructure<MovieDto>rs=new ResponseStructure<MovieDto>();
		if(mdto!=null) {
			rs.setMessage("save movie sucessfully");
			rs.setStatus(HttpStatus.CREATED.value());
			rs.setData(mdto);
			return new  ResponseEntity<ResponseStructure<MovieDto>>(rs,HttpStatus.CREATED);
		}
		throw new Movienotfound("no student found");
			
		}
	public ResponseEntity<ResponseStructure<MovieDto>>findmovie(int  movieid){
		MovieDto mdto=new MovieDto();
		ModelMapper mp=new ModelMapper();
		mp.map(moviedao.findmovie(movieid),mdto );
		ResponseStructure<MovieDto>rs=new ResponseStructure<MovieDto>();
		if(mdto!=null) {
			rs.setMessage("findmovie movie sucessfully");
			rs.setStatus(HttpStatus.NOT_FOUND.value());
			rs.setData(mdto);
			return new  ResponseEntity<ResponseStructure<MovieDto>>(rs,HttpStatus.NOT_FOUND);
		}
		throw new Movienotfound("no student found");
			
		}
	public ResponseEntity<ResponseStructure<MovieDto>>deletemovie(int  movieid){
		MovieDto mdto=new MovieDto();
		ModelMapper mp=new ModelMapper();
		mp.map(moviedao.deletemovie(movieid),mdto );
		ResponseStructure<MovieDto>rs=new ResponseStructure<MovieDto>();
		if(mdto!=null) {
			rs.setMessage("delete movie movie sucessfully");
			rs.setStatus(HttpStatus.NOT_FOUND.value());
			rs.setData(mdto);
			return new  ResponseEntity<ResponseStructure<MovieDto>>(rs,HttpStatus.NOT_FOUND);
		}
		throw new Movienotfound("no student found");
			
		}
	public ResponseEntity<ResponseStructure<MovieDto>>updatemovie(Movie movie,int  movieid){
		MovieDto mdto=new MovieDto();
		ModelMapper mp=new ModelMapper();
		mp.map(moviedao.updatemovie(movie, movieid),mdto );
		ResponseStructure<MovieDto>rs=new ResponseStructure<MovieDto>();
		if(mdto!=null) {
			rs.setMessage("update movie movie sucessfully");
			rs.setStatus(HttpStatus.OK.value());
			rs.setData(mdto);
			return new  ResponseEntity<ResponseStructure<MovieDto>>(rs,HttpStatus.OK);
		}
		throw new Movienotfound("no student found");
			
	}
	public ResponseEntity<ResponseStructure<MovieDto>>Assignreviewtomovie(int movieid,List<Integer> reviewid){
		MovieDto mdto=new MovieDto();
		ModelMapper m=new ModelMapper();
		Movie m1=moviedao.findmovie(movieid);
		if(m1!=null) {
			List<Review>exreview=reviewrepo.findAllById(reviewid);
			m1.setReview(exreview);
			m.map(moviedao.updatemovie(m1, movieid), moviedao);
			ResponseStructure<MovieDto> structure=new ResponseStructure<MovieDto>();
			structure.setMessage("assign theatreAdmin to admin succesffuly");
			structure.setStatus(HttpStatus .OK.value());
			structure.setData(mdto);
			return new ResponseEntity<ResponseStructure<MovieDto>>(structure,HttpStatus.OK);
		}
		throw new ReviewNotFound("we can't assign review to movie");
	}
		
	}


	

