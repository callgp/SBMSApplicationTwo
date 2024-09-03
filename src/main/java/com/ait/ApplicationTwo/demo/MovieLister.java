package com.ait.ApplicationTwo.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MovieLister {
	
	//@Value("2023")
	@Value("${movie.releasdYear")
	private int releasedYear;
	
	@Autowired
	private MovieFinder movieFinder;
	
	
	public void printMovies() {
		System.out.println(movieFinder.getClass().getName());
	List<Movie> moviesList=	movieFinder.findMoviesByYear(releasedYear);
	//System.out.println();
	moviesList.forEach( movie->System.out.println(movie.getReleasedYear()+" "+movie.getMovieName()));
	}

}
