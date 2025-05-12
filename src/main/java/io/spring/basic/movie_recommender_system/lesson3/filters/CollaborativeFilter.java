package io.spring.basic.movie_recommender_system.lesson3.filters;

import org.springframework.stereotype.Component;

import java.util.List;

@Component(MovieFiltersNames.COLLABORATIVE_FILTER_BEAN_NAME)
public class CollaborativeFilter implements MoviesFilter {
    public List<String> getRecommendations(String movie) {
        return List.of("Finding Nemo", "Ice Age", "Toy Story");
    }
}
