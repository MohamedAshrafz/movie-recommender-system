package io.spring.basic.movie_recommender_system.lesson11;

import io.spring.basic.movie_recommender_system.lesson11.models.Movie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
// like using @Configuration, @ComponentScan & @EnableAutoConfiguration
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        //Retrieving singleton bean from application context
        MovieRecommender recommender = appContext.getBean(MovieRecommender.class);
        System.out.println(recommender);

        // The Movie constructor and PostConstruct are not called till this code is executed
        System.out.println("The Movie constructor and PostConstruct are not called till this code is executed ");
        //Retrieving prototype bean from application context twice
        Movie m1 = appContext.getBean(Movie.class);
        System.out.println(m1);

        Movie m2 = appContext.getBean(Movie.class);
        System.out.println(m2);

        // No calling the  movie class PreDestroy method
        // (Spring does not manage the entire life cycle of the prototype beans for the performance sake)
    }

}
