package io.spring.basic.movie_recommender_system.lesson15.filters;

import io.spring.basic.movie_recommender_system.lesson15.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CollaborativeFilter implements MoviesFilter {
    public CollaborativeFilter() {
        System.out.println("The CollaborativeFilter bean constructor was called, creating the bean ..");
    }

    public List<String> getRecommendations(String movie) {
        return List.of("Finding Nemo", "Ice Age", "Toy Story");
    }

    @Autowired
    private Movie movie;

    @Override
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
