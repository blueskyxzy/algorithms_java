package com.xzy.factory.simplefactory;

/**
 * Created by xzy on 18/6/25  .
 */

public class Client2 {

    public static void  main(String[] args){

        Car car1 = CarFactory.createCar("奥迪");
        Car car2 = CarFactory.createCar("宝马");
        car1.run();
        car2.run();

        System.out.println("car1:" + car1);
        System.out.println("car2:" + car2);
    }
}
