package io.spring.basic.movie_recommender_system.lesson3;

import com.sun.tools.javac.Main;
import io.spring.basic.movie_recommender_system.lesson3.config.ProjectConfigStereotype;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfigStereotype.class);

        MovieRecommender movieRec = context.getBean(MovieRecommender.class);

        System.out.println(movieRec.recommendMovies("Dory here"));
    }

}
