package io.spring.basic.movie_recommender_system.lesson2.filters;

import java.util.List;

public class CollaborativeFilter implements MoviesFilter {
    public List<String> getRecommendations(String movie) {
        return List.of("Finding Nemo", "Ice Age", "Toy Story");
    }
}
