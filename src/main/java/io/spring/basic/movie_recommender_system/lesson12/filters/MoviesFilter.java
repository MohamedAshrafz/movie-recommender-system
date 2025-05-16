package io.spring.basic.movie_recommender_system.lesson12.filters;

import io.spring.basic.movie_recommender_system.lesson12.models.Movie;

import java.util.List;

public interface MoviesFilter {
    public List<String> getRecommendations(String movie);

    public Movie getMovie();
}
