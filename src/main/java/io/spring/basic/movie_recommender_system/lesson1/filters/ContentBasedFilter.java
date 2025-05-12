package io.spring.basic.movie_recommender_system.lesson1.filters;

import java.util.List;

public class ContentBasedFilter {
    public List<String> getRecommendations(String movie) {
        return List.of("Happy Feet", "Ice Age", "Shark Tale");
    }
}
