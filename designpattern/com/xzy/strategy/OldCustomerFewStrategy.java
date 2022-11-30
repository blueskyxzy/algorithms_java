package com.xzy.strategy;

/**
 * Created by xzy on 18/8/16  .
 */

public class OldCustomerFewStrategy implements Strategy{
    @Override
    public double getPrice(double price) {
        return 0.8 * price;
    }
}
