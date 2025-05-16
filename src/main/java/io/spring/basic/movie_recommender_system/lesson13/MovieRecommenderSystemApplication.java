package io.spring.basic.movie_recommender_system.lesson13;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ComponentScan
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext appContext =
                     new AnnotationConfigApplicationContext(MovieRecommenderSystemApplication.class)) {
            MovieRecommender movieRecommender = appContext.getBean(MovieRecommender.class);

            //call method to get recommendations
            List<String> result = movieRecommender.recommendMovies("Finding Dory");

            //display results
            System.out.println(movieRecommender);
            System.out.println(movieRecommender.getFilter());
            System.out.println(result);
        }
    }

}
