package io.spring.basic.movie_recommender_system.lesson14.filters;

import io.spring.basic.movie_recommender_system.lesson14.models.Movie;

import java.util.List;

/** Important Note:

 Spring creates a singleton bean even before we ask for it,
 while a prototype bean is not created till we request Spring for the bean. In the code widget below */
public class ContentBasedFilter implements MoviesFilter {

    //for keeping track of instances created
    private static int instances = 0;

    private Movie movie;

    public ContentBasedFilter() {
        instances++;
        System.out.println("In ContentBasedFilter constructor method");
    }

    @Override
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public static int getInstances() {
        return ContentBasedFilter.instances;
    }

    public List<String> getRecommendations(String movie) {
        return List.of("Happy Feet", "Ice Age", "Shark Tale");
    }
}
