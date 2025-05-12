package io.spring.basic.movie_recommender_system.lesson5.filters;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Primary // Notice @Primary takes the priority over the matching by name
public class ContentBasedFilter implements MoviesFilter {
    public List<String> getRecommendations(String movie) {
        return List.of("Happy Feet", "Ice Age", "Shark Tale");
    }
}
