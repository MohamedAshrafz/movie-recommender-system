package io.spring.basic.movie_recommender_system.spare;

import org.springframework.stereotype.Component;

@Component
public class Series {
    private String name;
    private float score;

    public Series(String name, float score) {
        this.name = name;
        this.score = score;
    }
}
