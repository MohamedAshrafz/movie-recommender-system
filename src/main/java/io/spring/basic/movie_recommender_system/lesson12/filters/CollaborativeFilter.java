package io.spring.basic.movie_recommender_system.lesson12.filters;

import io.spring.basic.movie_recommender_system.lesson12.models.Movie;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.context.annotation.Primary;

import java.util.List;

@Named
public class CollaborativeFilter implements MoviesFilter {
    public CollaborativeFilter() {
        System.out.println("The CollaborativeFilter bean constructor was called, creating the bean ..");
    }

    public List<String> getRecommendations(String movie) {
        return List.of("Finding Nemo", "Ice Age", "Toy Story");
    }

    @Inject
    private Movie movie;

    @Override
    public Movie getMovie() {
        return movie;
    }
}
