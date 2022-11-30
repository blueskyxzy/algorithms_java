package com.xzy.strategy;

/**
 * Created by xzy on 18/8/16  .
 */

public class NewCustomerFewStrategy implements Strategy{
    @Override
    public double getPrice(double price) {
        return price;
    }
}
