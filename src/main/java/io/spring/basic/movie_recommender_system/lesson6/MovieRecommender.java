package io.spring.basic.movie_recommender_system.lesson6;

import io.spring.basic.movie_recommender_system.lesson6.filters.MoviesFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MovieRecommender {

    // wiring by names
    @Autowired
    @Qualifier("CBF")
    private MoviesFilter filter;

    public List<String> recommendMovies(String movie) {
        System.out.printf("The filter used in recommending is: [%s]\n", filter.getClass().getSimpleName());
        List<String> recommendationList = filter.getRecommendations(movie);

        return recommendationList;
    }
}
