package com.xzy.decorator;


import java.io.*;

/**
 * Created by xzy on 18/6/28  .
 */

public class Client {

    public static void main(String[] args) throws FileNotFoundException {
        Car car = new Car();
        car.move();

        FlyCar flyCar = new FlyCar(car);
        flyCar.move();

        WaterCar waterCar = new WaterCar(car);
        waterCar.move();

        WaterCar wateFlyCar = new WaterCar(new FlyCar(car));
        wateFlyCar.move();

        Reader r = new BufferedReader(new InputStreamReader(new FileInputStream(new File("decorator.txt"))));

        InputStream inputStream = new BufferedInputStream(new FileInputStream(new File("decorator.txt")));
        // IO流装饰器
        //    Component抽象构件: interface InputStream
        //    ConcreteComponent: FileInputStream extends InputStream
        //    Decorator: FilterInputStream  protected volatile InputStream in;
        //    ConcreteDecorator:BufferedInputStream extends FilterInputStream  重写InputStream reader方法
    }
}
