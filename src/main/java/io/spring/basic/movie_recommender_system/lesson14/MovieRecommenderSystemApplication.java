package io.spring.basic.movie_recommender_system.lesson14;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        //check the beans which have been loaded
        System.out.println("\nBeans loaded:");
        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

        MovieRecommender movieRecommender = context.getBean(MovieRecommender.class);

        //call method to get recommendations
        List<String> result = movieRecommender.recommendMovies("Finding Dory");

        //display results
        System.out.println(movieRecommender);
        System.out.println(movieRecommender.getFilter());
        System.out.println(result);

        context.close();
    }

}
