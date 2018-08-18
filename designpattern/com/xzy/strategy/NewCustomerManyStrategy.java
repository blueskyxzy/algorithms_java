package com.xzy.strategy;

/**
 * Created by xzy on 18/8/16  .
 */

public class NewCustomerManyStrategy implements Strategy {
    @Override
    public double getPrice(double price) {
        return 0.9*price;
    }
}
