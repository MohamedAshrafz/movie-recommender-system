package io.spring.basic.movie_recommender_system.lesson8.filters;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Primary
public class CollaborativeFilter implements MoviesFilter {
    public CollaborativeFilter() {
        System.out.println("The CollaborativeFilter bean constructor was called, creating the bean ..");
    }

    public List<String> getRecommendations(String movie) {
        return List.of("Finding Nemo", "Ice Age", "Toy Story");
    }
}
