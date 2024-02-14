package com.project.moviebooking.moviebooking.Service;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.moviebooking.moviebooking.Dao.MovieDao;
import com.project.moviebooking.moviebooking.Dto.MovieDto;
import com.project.moviebooking.moviebooking.entity.Movie;
import com.project.moviebooking.moviebooking.util.ResponseStructure;

@Service
public class MovieService {
	MovieDao moviedao;
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
		return null;
			
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
		return null;
			
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
		return null;
			
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
		return null;
			
	}
}
	

