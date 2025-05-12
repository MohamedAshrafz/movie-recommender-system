package io.spring.basic.movie_recommender_system.lesson2;

import io.spring.basic.movie_recommender_system.lesson2.filters.MoviesFilter;

import java.util.List;

public class MovieRecommender {

    private final MoviesFilter filter;

    public MovieRecommender(MoviesFilter filter) {
        this.filter = filter;
    }

    public List<String> recommendMovies(String movie) {
        System.out.printf("The filter used in recommending is: [%s]\n", filter.getClass().getSimpleName());
        List<String> recommendationList = filter.getRecommendations(movie);

        return recommendationList;
    }
}
