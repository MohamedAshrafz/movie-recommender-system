package io.spring.basic.movie_recommender_system.lesson15.models;


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