package io.spring.basic.movie_recommender_system.lesson16.filters;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
/** Important Note:

 Spring creates a singleton bean even before we ask for it,
 while a prototype bean is not created till we request Spring for the bean. In the code widget below */
@Primary
public class ContentBasedFilter implements MoviesFilter {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //for keeping track of instances created
    private static int instances = 0;

//    @Autowired
//    private Movie movie;

    public ContentBasedFilter() {
        instances++;
        logger.info("In ContentBasedFilter constructor method");
    }

    @PostConstruct
    private void postConstruct() {
        //load movies into cache
        logger.info("In ContentBasedFilter postConstruct method");
    }

    @PreDestroy
    private void preDestroy() {
        //load movies into cache
        logger.info("In ContentBasedFilter preDestroy method");
    }

//    //    @Lookup // Like context.getBean for every movie bean
//    public Movie getMovie() {
//        return movie;
//    }

    public static int getInstances() {
        return ContentBasedFilter.instances;
    }

    public List<String> getRecommendations(String movie) {
        return List.of("Happy Feet", "Ice Age", "Shark Tale");
    }
}
