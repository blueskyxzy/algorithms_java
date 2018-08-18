package com.xzy.strategy;

/**
 * Created by xzy on 18/8/16  .
 */

public class Context {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void calculatePrice(double price){
        System.out.println(strategy.getPrice(price));
    }
}
