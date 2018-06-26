package com.xzy.factory.simplefactory;

/**
 * Created by xzy on 18/6/25  .
 */

public class CarFactory2 {

    public static Car creatAudi(){
        return new Audi();
    }

    public static Car creatBaoMa(){
        return new BaoMa();
    }
}
