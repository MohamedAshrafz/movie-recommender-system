package io.spring.basic.movie_recommender_system.lesson1;

import io.spring.basic.movie_recommender_system.lesson1.filters.ContentBasedFilter;

import java.util.List;

public class MovieRecommender {
    public List<String> recommendMovies(String movie) {
        ContentBasedFilter filter = new ContentBasedFilter();
        List<String> recommendationList = filter.getRecommendations(movie);

        return recommendationList;
    }
}
