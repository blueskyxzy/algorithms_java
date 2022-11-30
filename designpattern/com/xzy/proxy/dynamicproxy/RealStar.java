package com.xzy.proxy.dynamicproxy;

/**
 * Created by xzy on 18/6/27  .
 */

public class RealStar implements Star{

    @Override
    public void confer() {
        System.out.println("面谈");
    }

    @Override
    public void signContract() {
        System.out.println("签合同");
    }

    @Override
    public void bookTicket() {
        System.out.println("订票");
    }

    @Override
    public void sing() {
        System.out.println("唱歌");
    }

    @Override
    public void collect() {
        System.out.println("收款");
    }
}
