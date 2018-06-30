package com.xzy.bridge;

/**
 * Created by xzy on 18/6/26  .
 */

public class Client {

    public static void main(String[] args){
        Computer intelLapTop = new LapTop(new Intel());
        intelLapTop.sale();

        Computer dellPad = new Pad(new Dell());
        dellPad.sale();
    }
}
