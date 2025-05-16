package io.spring.basic.movie_recommender_system.lesson12;

import io.spring.basic.movie_recommender_system.lesson12.models.Movie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
// like using @Configuration, @ComponentScan & @EnableAutoConfiguration
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        MovieRecommender recommender = appContext.getBean(MovieRecommender.class);
        System.out.println(recommender);
        System.out.println(recommender.getFilter());
        System.out.println(recommender.getFilter().getMovie());

        // No calling the  movie class PreDestroy method
        // (Spring does not manage the entire life cycle of the prototype beans for the performance sake)
    }

}
