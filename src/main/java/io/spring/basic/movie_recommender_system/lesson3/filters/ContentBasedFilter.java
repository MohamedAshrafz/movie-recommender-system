package io.spring.basic.movie_recommender_system.lesson3.filters;

import org.springframework.stereotype.Component;

import java.util.List;

@Component(MovieFiltersNames.CONTENT_BASED_FILTER_BEAN_NAME)
public class ContentBasedFilter implements MoviesFilter {
    public List<String> getRecommendations(String movie) {
        return List.of("Happy Feet", "Ice Age", "Shark Tale");
    }
}
