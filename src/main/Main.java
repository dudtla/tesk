package main;

import movie.MovieRatings;

public class Main {

	public static void main(String[] args) {
		
		MovieRatings mr = new MovieRatings();
		
		boolean isfinish = false;
		while(!isfinish) {
		isfinish = mr.showMenu();
		}
	}

}
