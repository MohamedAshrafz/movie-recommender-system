package io.spring.basic.movie_recommender_system.lesson13.filters;

import io.spring.basic.movie_recommender_system.lesson13.models.Movie;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

/** Important Note:

 Spring creates a singleton bean even before we ask for it,
 while a prototype bean is not created till we request Spring for the bean. In the code widget below */
@Component
@Primary
public class ContentBasedFilter implements MoviesFilter {

    //for keeping track of instances created
    private static int instances = 0;

    private Movie movie;

    public ContentBasedFilter() {
        instances++;
        System.out.println("In ContentBasedFilter constructor method");
    }

//    //    @Lookup // Like context.getBean for every movie bean
    @Override
    public Movie getMovie() {
        return movie;
    }

    public static int getInstances() {
        return ContentBasedFilter.instances;
    }

    public List<String> getRecommendations(String movie) {
        return List.of("Happy Feet", "Ice Age", "Shark Tale");
    }
}
