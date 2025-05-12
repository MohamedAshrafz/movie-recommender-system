package io.spring.basic.movie_recommender_system.lesson2;

import io.spring.basic.movie_recommender_system.lesson2.filters.CollaborativeFilter;
import io.spring.basic.movie_recommender_system.lesson2.filters.ContentBasedFilter;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		MovieRecommender movieRecommender = new MovieRecommender(new CollaborativeFilter());
		System.out.println(movieRecommender.recommendMovies("Finding Dory"));
	}

}
