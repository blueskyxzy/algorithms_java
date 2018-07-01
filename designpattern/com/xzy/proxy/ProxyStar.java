package com.xzy.proxy;

/**
 * Created by xzy on 18/6/27  .
 */

// 静态代理类

public class ProxyStar implements Star{

    Star star;

    public ProxyStar(Star star) {
        this.star = star;
    }

    @Override
    public void confer() {
        System.out.println("ProxyStar.confer()");
    }

    @Override
    public void signContract() {
        System.out.println("ProxyStar.signContract()");
    }

    @Override
    public void bookTicket() {
        System.out.println("ProxyStar.bookTicket()");

    }

    @Override
    public void sing() {
        System.out.println("ProxyStar.sing()");
        star.sing();
    }

    @Override
    public void collect() {
        System.out.println("ProxyStar.collect()");
    }
}
