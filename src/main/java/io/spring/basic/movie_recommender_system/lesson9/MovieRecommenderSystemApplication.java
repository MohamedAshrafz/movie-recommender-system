package io.spring.basic.movie_recommender_system.lesson9;

import io.spring.basic.movie_recommender_system.lesson9.filters.ContentBasedFilter;
import io.spring.basic.movie_recommender_system.lesson9.filters.MoviesFilter;
import io.spring.basic.movie_recommender_system.lesson9.models.Movie;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
// like using @Configuration, @ComponentScan & @EnableAutoConfiguration
@ComponentScan(basePackages = {
        "io.spring.basic.movie_recommender_system.lesson9"
})
//@ComponentScan(basePackages = "io.spring.basic.movie_recommender_system.spare", excludeFilters = @ComponentScan.Filter(
//        type = FilterType.REGEX,
//        pattern = "io.spring.basic.movie_recommender_system.spare.series.*"
//))
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        //Retrieve singleton bean from application context
        MoviesFilter filter = appContext.getBean(MoviesFilter.class);

        System.out.println("\nContentBasedFilter bean with singleton scope");
        System.out.println(filter);

        System.out.println("\nMovie bean with prototype scope");
        System.out.println(filter.getMovie());
        System.out.println(filter.getMovie());
        System.out.println(filter.getMovie());

        //Print number of instances of each bean
        System.out.println("\nContentBasedFilter instances created: " + ContentBasedFilter.getInstances());
        System.out.println("Movie instances created: " + Movie.getInstances());
    }

}
