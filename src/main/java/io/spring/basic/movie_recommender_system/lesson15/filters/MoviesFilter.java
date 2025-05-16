package io.spring.basic.movie_recommender_system.lesson15.filters;

import io.spring.basic.movie_recommender_system.lesson15.models.Movie;

import java.util.List;

public interface MoviesFilter {
    public List<String> getRecommendations(String movie);

    public Movie getMovie();
}
