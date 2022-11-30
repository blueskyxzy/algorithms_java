package com.xzy.factory.abstractfactory;

public interface Tyre {
    void revolve();
}

class LowTyre implements Tyre{

    @Override
    public void revolve() {
        System.out.println("磨损快");
    }
}

class LuxuryTyre implements Tyre{

    @Override
    public void revolve() {
        System.out.println("耐磨损");
    }
}