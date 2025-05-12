package io.spring.basic.movie_recommender_system.lesson5.filters;

import java.util.List;

public interface MoviesFilter {
    public List<String> getRecommendations(String movie);
}
