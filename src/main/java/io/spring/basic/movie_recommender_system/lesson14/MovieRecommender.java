package io.spring.basic.movie_recommender_system.lesson14;

import io.spring.basic.movie_recommender_system.lesson14.filters.MoviesFilter;

import java.util.List;

public class MovieRecommender {

    private MoviesFilter filter;


    public MovieRecommender(MoviesFilter filter) {
        System.out.println("In RecommenderImplementation setter method..dependency injection");
        this.filter = filter;
    }

    public MoviesFilter getFilter() {
        return filter;
    }

    public List<String> recommendMovies(String movie) {
        System.out.printf("The filter used in recommending is: [%s]\n", filter.getClass().getSimpleName());
        List<String> recommendationList = filter.getRecommendations(movie);

        return recommendationList;
    }
}
