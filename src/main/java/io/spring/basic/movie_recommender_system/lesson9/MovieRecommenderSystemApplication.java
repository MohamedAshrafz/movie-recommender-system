package io.spring.basic.movie_recommender_system.lesson9;

import io.spring.basic.movie_recommender_system.lesson9.filters.ContentBasedFilter;
import io.spring.basic.movie_recommender_system.lesson9.filters.MoviesFilter;
import io.spring.basic.movie_recommender_system.lesson9.models.Movie;
import io.spring.basic.movie_recommender_system.spare.Series;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
// like using @Configuration, @ComponentScan & @EnableAutoConfiguration
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        //Retrieve singleton bean from application context
        MoviesFilter filter = appContext.getBean(MoviesFilter.class);
        Series series = appContext.getBean(Series.class);
        System.out.println("\nContentBasedFilter bean with singleton scope");
        System.out.println(filter);

        System.out.println("\nMovie bean with prototype scope");
        System.out.println(filter.getMovie());
        System.out.println(filter.getMovie());
        System.out.println(filter.getMovie());
        System.out.println(series);

        //Print number of instances of each bean
        System.out.println("\nContentBasedFilter instances created: " + ContentBasedFilter.getInstances());
        System.out.println("Movie instances created: "+ Movie.getInstances());
    }

}
