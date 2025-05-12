package io.spring.basic.movie_recommender_system.lesson6.filters;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Primary
public class CollaborativeFilter implements MoviesFilter {
    public List<String> getRecommendations(String movie) {
        return List.of("Finding Nemo", "Ice Age", "Toy Story");
    }
}
