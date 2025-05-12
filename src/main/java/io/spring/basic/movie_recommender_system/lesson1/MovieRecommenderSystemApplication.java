package io.spring.basic.movie_recommender_system.lesson1;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		MovieRecommender movieRecommender = new MovieRecommender();
		System.out.println(movieRecommender.recommendMovies("Finding Dory"));
	}

}
