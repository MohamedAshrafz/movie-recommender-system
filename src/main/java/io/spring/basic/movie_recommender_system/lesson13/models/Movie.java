package io.spring.basic.movie_recommender_system.lesson13.models;

import org.springframework.stereotype.Component;

@Component
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Movie {
    //for keeping track of instances created
    private static int instances = 0;

    private int id;
    private String name;
    private String genre;
    private String producer;

    public Movie() {
        instances++;
        System.out.printf("Movie constructor called, The NO of instances is [%s]\n", getInstances());
    }

    public static int getInstances() {
        return Movie.instances;
    }
}