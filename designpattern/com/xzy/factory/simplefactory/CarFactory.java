package com.xzy.factory.simplefactory;

/**
 * Created by xzy on 18/6/25  .
 */

public class CarFactory {

    public static Car createCar(String type){
        if ("奥迪".equals(type)){
            return new Audi();
        } else if("宝马".equals(type)){
            return new BaoMa();
        } else {
            return null;
        }
    }
}
