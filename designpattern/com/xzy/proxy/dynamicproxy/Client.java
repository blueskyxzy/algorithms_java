package com.xzy.proxy.dynamicproxy;


import java.lang.reflect.Proxy;
import java.util.logging.Handler;

/**
 * Created by xzy on 18/6/27  .
 */

public class Client {

    public static void main(String[] args){
        Star realStar = new RealStar();
        StarHandler starHandler = new StarHandler(realStar);
        Star proxy = (Star)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Star.class},starHandler); // 获取代理类对象
        proxy.bookTicket();
        proxy.sing();
    }
}
