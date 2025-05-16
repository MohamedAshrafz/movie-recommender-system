package io.spring.basic.movie_recommender_system.lesson16;

import io.spring.basic.movie_recommender_system.lesson16.filters.MoviesFilter;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
}
