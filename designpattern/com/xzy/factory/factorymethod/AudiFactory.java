package com.xzy.factory.factorymethod;

/**
 * Created by xzy on 18/6/25  .
 */

public class AudiFactory implements CarFactroy{
    @Override
    public Car createCar() {
        return new Audi();
    }
}
