package com.ait.ApplicationTwo.demo;

public class Movie {
	private final Integer releasedYear;
	private final String movieName;

	public Movie(Integer i, String string) {
		this.releasedYear = i;
		// TODO Auto-generated constructor stub
		this.movieName = string;
	}

	public Integer getReleasedYear() {
		return releasedYear;
	}

	public String getMovieName() {
		return movieName;
	}


}
