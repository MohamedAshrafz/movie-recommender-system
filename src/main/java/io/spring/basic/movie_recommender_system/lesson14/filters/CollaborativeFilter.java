package io.spring.basic.movie_recommender_system.lesson14.filters;

import io.spring.basic.movie_recommender_system.lesson14.models.Movie;

import java.util.List;

public class CollaborativeFilter implements MoviesFilter {
    public CollaborativeFilter() {
        System.out.println("The CollaborativeFilter bean constructor was called, creating the bean ..");
    }

    public List<String> getRecommendations(String movie) {
        return List.of("Finding Nemo", "Ice Age", "Toy Story");
    }

    private Movie movie;

    @Override
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
