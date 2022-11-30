package com.xzy.factory.factorymethod;


/**
 * Created by xzy on 18/6/25  .
 */

public class Client1 {

    public static void  main(String[] args){
        Car car1 = new AudiFactory().createCar();
        Car car2 = new BaoMaFactory().createCar();

        car1.run();
        car2.run();
        System.out.println("car1:" + car1);
        System.out.println("car2:" + car2);
    }


}
