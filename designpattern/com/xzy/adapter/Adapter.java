package com.xzy.adapter;

/**
 * Created by xzy on 18/6/27  .
 */

// 类适配器方式

public class Adapter extends Adaptee implements Target {
    @Override
    public void handleReq() {
        super.request();
    }
}
