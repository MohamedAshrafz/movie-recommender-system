package io.spring.basic.movie_recommender_system.challenge;


public interface DiscountStrategy {
    double applyDiscount(double originalPrice);
}