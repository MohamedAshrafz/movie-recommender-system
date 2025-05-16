package io.spring.basic.movie_recommender_system.challenge;

import org.springframework.stereotype.Component;

@Component("BDS")
public class BundleDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double originalPrice) {
        // Apply discount based on bundled purchases
        return originalPrice * 0.9; // 10% discount
    }
}