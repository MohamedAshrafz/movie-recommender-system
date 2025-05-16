package io.spring.basic.movie_recommender_system.lesson12;

import io.spring.basic.movie_recommender_system.lesson12.filters.MoviesFilter;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Named
public class MovieRecommender {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private MoviesFilter filter;

    @Inject
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

    @PreDestroy
    public void preDestroy() {
        //initialization code goes here
        logger.info("In RecommenderImplementation preDestroy method");
    }
}
