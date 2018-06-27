package com.xzy.factory.abstractfactory;

public interface Seat {
    void message();
}

class LowSeat implements Seat{

    @Override
    public void message() {
        System.out.println("坐着不舒服");
    }
}

class LuxurySeat implements Seat{

    @Override
    public void message() {
        System.out.println("可以自动按摩，舒服");
    }
}