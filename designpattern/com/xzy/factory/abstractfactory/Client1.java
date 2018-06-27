package com.xzy.factory.abstractfactory;


/**
 * Created by xzy on 18/6/25  .
 */

public class Client1 {

    public static void  main(String[] args){

        LuxuryCarFactory luxuryCarFactory = new LuxuryCarFactory();
        Engine engine = luxuryCarFactory.createEngine();
        engine.start();
        engine.run();
        engine.stop();

    }


}
