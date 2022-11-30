package com.xzy.adapter;

/**
 * Created by xzy on 18/6/27  .
 */

// 对象适配器方式，使用组合方式整合
public class Adapter2 implements Target{

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    private Adaptee adaptee = new Adaptee();

    @Override
    public void handleReq() {
        adaptee.request();
    }
}
