package com.xzy.singleton;

/**
 * Created by xzy on 18/6/20  .
 */

public class SinlgetonTest {

    public static void  main(String[] args ){
        SingletonEHS instance1 = SingletonEHS.getInstance();
        SingletonEHS instance2 = SingletonEHS.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);
    }
}
