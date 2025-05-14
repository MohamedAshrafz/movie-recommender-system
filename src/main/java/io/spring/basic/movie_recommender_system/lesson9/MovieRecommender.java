package io.spring.basic.movie_recommender_system.lesson9;

import io.spring.basic.movie_recommender_system.lesson9.filters.MoviesFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MovieRecommender {

    // wiring by names
    @Autowired
    private MoviesFilter filter;

    public MoviesFilter getFilter() {
        return filter;
    }

    public List<String> recommendMovies(String movie) {
        System.out.printf("The filter used in recommending is: [%s]\n", filter.getClass().getSimpleName());
        List<String> recommendationList = filter.getRecommendations(movie);

        return recommendationList;
    }
}
