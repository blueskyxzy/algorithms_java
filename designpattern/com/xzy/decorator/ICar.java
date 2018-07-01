package com.xzy.decorator;

public interface ICar {
    void move();
}

class Car implements ICar{

    @Override
    public void move() {
        System.out.println("普通车路上跑");
    }
}

abstract class CarDecorator implements ICar{

    public CarDecorator(ICar icar) {
        this.icar = icar;
    }

    private ICar icar;

    @Override
    public void move() {
        icar.move();
    }
}

class FlyCar extends CarDecorator{

    public FlyCar(ICar car) {
        super(car);
    }

    public void fly(){
        System.out.println("可以飞");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}

class WaterCar extends CarDecorator{

    public WaterCar(ICar car) {
        super(car);
    }

    public void swim(){
        System.out.println("可以水上游");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }
}

class AICar extends CarDecorator{

    public AICar(ICar car) {
        super(car);
    }

    public void ai(){
        System.out.println("可以自动跑");
    }

    @Override
    public void move() {
        super.move();
        ai();
    }
}