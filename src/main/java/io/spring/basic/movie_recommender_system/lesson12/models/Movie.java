package io.spring.basic.movie_recommender_system.lesson12.models;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.inject.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

@Named
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Movie {

    private Logger logger = LoggerFactory.getLogger(Movie.class);

    //for keeping track of instances created
    private static int instances = 0;

    private int id;
    private String name;
    private String genre;
    private String producer;

    public Movie() {
        instances++;
        logger.info("Movie constructor called, The NO of instances is [{}]", getInstances());
    }

    @PostConstruct
    private void postConstruct() {
        //load movies into cache
        logger.info("In Movie postConstruct method");
    }

    @PreDestroy
    private void preDestroy() {
        //load movies into cache
        logger.info("In Movie preDestroy method");
    }

    public static int getInstances() {
        return Movie.instances;
    }
}