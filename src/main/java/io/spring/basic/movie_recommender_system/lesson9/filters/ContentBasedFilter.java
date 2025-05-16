package io.spring.basic.movie_recommender_system.lesson9.filters;

import io.spring.basic.movie_recommender_system.lesson9.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
/** Important Note:

 Spring creates a singleton bean even before we ask for it,
 while a prototype bean is not created till we request Spring for the bean. In the code widget below */
@Primary
public class ContentBasedFilter implements MoviesFilter {

    //for keeping track of instances created
    private static int instances= 0;

    @Autowired
    private Movie movie;

    public ContentBasedFilter() {
        instances++;
        System.out.printf("ContentBasedFilter constructor called, The NO of instances is [%s]\n", getInstances());
    }

//    @Lookup // Like context.getBean for every movie bean
    public Movie getMovie() {
        return movie;
    }

    public static int getInstances(){
        return ContentBasedFilter.instances;
    }

    public List<String> getRecommendations(String movie) {
        return List.of("Happy Feet", "Ice Age", "Shark Tale");
    }
}
