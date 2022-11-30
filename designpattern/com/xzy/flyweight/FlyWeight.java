package com.xzy.flyweight;

// 享元类
public interface FlyWeight {

    void setColor(String s);

    String getColor();

    void display(Coordinate c);
}

class ConcreteFlyWeight implements FlyWeight{

    private String color;

    public ConcreteFlyWeight(String color) {
        this.color = color;
    }

    @Override
    public void setColor(String s) {
        this.color = s;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate c) {
        System.out.println("color:"+ color);
        System.out.println("x:"+ c.getX());
        System.out.println("y:"+ c.getY());
    }
}