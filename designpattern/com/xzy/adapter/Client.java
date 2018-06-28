package com.xzy.adapter;


/**
 * Created by xzy on 18/6/26  .
 */

public class Client {

    public static void main(String[] args){
        Target t = new Adapter(); // 类适配
        test1(t);
        Target t2 = new Adapter2(new Adaptee()); // 对象组合适配
        test1(t2);
    }

    public static void test1(Target t){
        t.handleReq();
    }
}
