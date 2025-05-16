package io.spring.basic.movie_recommender_system.lesson17;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:modified.properties")
// like using @Configuration, @ComponentScan & @EnableAutoConfiguration
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
        MovieRecommender recommender = appContext.getBean(MovieRecommender.class);

        System.out.printf("The user fav movie is: [%s]\n", recommender.getFavMovie());

    }

}
