package io.spring.basic.movie_recommender_system.lesson3;

import io.spring.basic.movie_recommender_system.lesson3.filters.MovieFiltersNames;
import io.spring.basic.movie_recommender_system.lesson3.filters.MoviesFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MovieRecommender {

    private final MoviesFilter filter;

    @Autowired
    public MovieRecommender(@Qualifier(MovieFiltersNames.CONTENT_BASED_FILTER_BEAN_NAME) MoviesFilter filter) {
        this.filter = filter;
    }

    public List<String> recommendMovies(String movie) {
        System.out.printf("The filter used in recommending is: [%s]\n", filter.getClass().getSimpleName());
        List<String> recommendationList = filter.getRecommendations(movie);

        return recommendationList;
    }
}
