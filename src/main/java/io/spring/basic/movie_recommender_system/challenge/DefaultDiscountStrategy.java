package io.spring.basic.movie_recommender_system.challenge;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("DDS")
@Primary
public class DefaultDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double originalPrice) {
        // Apply discount for online purchase
        return originalPrice * 0.95; // 5% discount
    }
}
