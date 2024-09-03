package com.ait.ApplicationTwo.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class MovieFinder {
	
	private Map<Integer,List<Movie> > moviesMap;
	
	public MovieFinder() {
		moviesMap=new HashMap<>();
		
		moviesMap.put(2022, Arrays.asList(new Movie(2022,"rrr"), new Movie(2022,"aaa")));
		moviesMap.put(2023, Arrays.asList(new Movie(2023,"bbb"), new Movie(2023,"ccc")));
		
	}

	public List<Movie> findMoviesByYear(int releasedYear) {
		// TODO Auto-generated method stub
		return moviesMap.get(releasedYear);
	}

}
