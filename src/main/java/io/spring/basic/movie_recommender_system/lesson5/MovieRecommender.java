package io.spring.basic.movie_recommender_system.lesson5;

import io.spring.basic.movie_recommender_system.lesson5.filters.MoviesFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MovieRecommender {

    // wiring by names
    @Autowired
    private MoviesFilter collaborativeFilter;
    @Autowired
    private MoviesFilter contentBasedFilter;

    public List<String> recommendMovies(String movie) {
        System.out.printf("The filter used in recommending is: [%s]\n", collaborativeFilter.getClass().getSimpleName());
        System.out.printf("Secondary filter in recommending is: [%s]\n", contentBasedFilter.getClass().getSimpleName());
        List<String> recommendationList = collaborativeFilter.getRecommendations(movie);

        return recommendationList;
    }
}
