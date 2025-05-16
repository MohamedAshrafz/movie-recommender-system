package io.spring.basic.movie_recommender_system.challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DiscountService {

    private final DiscountStrategy discountDEF, discountBDS, discountMDS;
    private final List<DiscountStrategy> discountStrategies;

    @Autowired
    public DiscountService(DiscountStrategy discountDEF,
                           @Qualifier("BDS") DiscountStrategy discountBDS,
                           @Qualifier("MDS") DiscountStrategy discountMDS,
                           List<DiscountStrategy> discountStrategies) {
        this.discountDEF = discountDEF;
        this.discountBDS = discountBDS;
        this.discountMDS = discountMDS;
        this.discountStrategies = discountStrategies;
    }

    public double applyDefaultDiscount(double originalPrice) {
        return discountDEF.applyDiscount(originalPrice);
    }

    public double applyBundleDiscount(double originalPrice) {
        return discountBDS.applyDiscount(originalPrice);
    }

    public double applyMembershipDiscount(double originalPrice) {
        return discountMDS.applyDiscount(originalPrice);
    }

    public double applyAllDiscounts(double originalPrice) {
        double discountedPrice = originalPrice;
        for (DiscountStrategy strategy : discountStrategies) {
            discountedPrice = strategy.applyDiscount(discountedPrice);
        }
        return discountedPrice;
    }
}