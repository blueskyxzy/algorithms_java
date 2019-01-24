package com.xzy.flyweight;


/**
 * Created by xzy on 18/6/26  .
 */

public class Client {

    public static void main(String[] args){
        ConcreteFlyWeight chess1 = FlyWeightFactory.get("黑色");
        ConcreteFlyWeight chess2 = FlyWeightFactory.get("黑色");
        System.out.println(chess1);
        System.out.println(chess2);

        chess1.display(new Coordinate(10,20));
        chess2.display(new Coordinate(30,20));
    }
}
