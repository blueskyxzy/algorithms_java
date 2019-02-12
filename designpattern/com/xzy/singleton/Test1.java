package com.xzy.singleton;

/**
 * created by xzy on 2019-01-31
 **/

public class Test1 {

//    饿汉式
//    private static Test1 t = new Test1();
//
//    private Test1(){
//    }
//
//    public static Test1 getInstance(){
//        return t;
//    }


    // 懒汉式
    private static Test1 t; // 不初始化

    private Test1(){

    }

    public synchronized static Test1 getInstance(){
        if (t == null){
            t = new Test1();
        }
        return t;
    }

}
