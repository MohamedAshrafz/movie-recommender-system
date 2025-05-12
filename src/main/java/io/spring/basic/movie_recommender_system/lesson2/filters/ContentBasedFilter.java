package io.spring.basic.movie_recommender_system.lesson2.filters;

import java.util.List;

public class ContentBasedFilter implements MoviesFilter {
    public List<String> getRecommendations(String movie) {
        return List.of("Happy Feet", "Ice Age", "Shark Tale");
    }
}
