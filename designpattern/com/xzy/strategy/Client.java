package com.xzy.strategy;


/**
 * Created by xzy on 18/8/15  .
 */

public class Client {

    public static void main(String[] args){
        Strategy strategy = new OldCustomerManyStrategy();
        Context context = new Context(strategy);

        context.calculatePrice(998);

    }

}
