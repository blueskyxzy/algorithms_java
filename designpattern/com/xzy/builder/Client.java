package com.xzy.builder;

/**
 * Created by xzy on 18/6/26  .
 */

public class Client {

    public static void main(String[] args){
        AirShipDirector director = new ConcreteAirShipDirector(new ConcreteAirShipBuilder());
        AirShip airShip = director.directAirShip();
        airShip.launch();
    }
}
