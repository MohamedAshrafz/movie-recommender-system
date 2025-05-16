package io.spring.basic.movie_recommender_system.lesson17;

import io.spring.basic.movie_recommender_system.lesson17.filters.MoviesFilter;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MovieRecommender {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // wiring by names

    private MoviesFilter filter;

    @Autowired
    public void setFilter(MoviesFilter filter) {
        logger.info("In RecommenderImplementation setter method..dependency injection");
        this.filter = filter;
    }

    public MoviesFilter getFilter() {
        return filter;
    }

    public List<String> recommendMovies(String movie) {
        System.out.printf("The filter used in recommending is: [%s]\n", filter.getClass().getSimpleName());
        List<String> recommendationList = filter.getRecommendations(movie);

        return recommendationList;
    }

    @PostConstruct
    public void postConstruct() {
        //initialization code goes here
        logger.info("In RecommenderImplementation postConstruct method");
    }

    // ${name of the parameter in the app properties file:default value if there's no entry}
    @Value("${recommender.favoriteMovie:Finding Dory}")
    private String favMovie;

    public String getFavMovie() {
        return favMovie;
    }

    @PreDestroy
    public void preDestroy() {
        //initialization code goes here
        logger.info("In RecommenderImplementation preDestroy method");
    }
}
