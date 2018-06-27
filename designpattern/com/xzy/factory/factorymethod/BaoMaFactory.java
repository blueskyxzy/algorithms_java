package com.xzy.factory.factorymethod;

/**
 * Created by xzy on 18/6/25  .
 */

public class BaoMaFactory implements CarFactroy{
    @Override
    public Car createCar() {
        return new BaoMa();
    }
}
