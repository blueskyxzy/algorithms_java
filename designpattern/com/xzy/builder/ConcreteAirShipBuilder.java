package com.xzy.builder;

/**
 * Created by xzy on 18/6/26  .
 */

public class ConcreteAirShipBuilder implements AirShipBuilder{    //StringBuilder, DomBuuilder, SaxBuilder

    @Override
    public Engine buildEngine() {
        System.out.println("构建引擎");
        return new Engine("志远引擎");
    }

    @Override
    public OrbitalModule buildOrbitalModule() {
        System.out.println("构建轨道舱");
        return new OrbitalModule("志远轨道舱");
    }

    @Override
    public EscapeTower buildEscapeTower() {
        System.out.println("构建逃逸塔");
        return new EscapeTower("志远逃逸塔");
    }
}
