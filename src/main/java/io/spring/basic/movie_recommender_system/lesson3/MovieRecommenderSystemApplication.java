package io.spring.basic.movie_recommender_system.lesson3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = {"io.spring.basic.movie_recommender_system.lesson3.filters", "io.spring.basic.movie_recommender_system.lesson3"})
// like using @Configuration, @ComponentScan & @EnableAutoConfiguration
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        MovieRecommender movieRecommender = context.getBean(MovieRecommender.class);

        System.out.println(movieRecommender.recommendMovies("Dory"));
    }

}
