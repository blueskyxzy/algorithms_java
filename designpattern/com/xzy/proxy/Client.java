package com.xzy.proxy;

/**
 * Created by xzy on 18/6/27  .
 */

public class Client {

    public static void main(String[] args){
        ProxyStar proxyStar = new ProxyStar(new RealStar());
        proxyStar.confer();
        proxyStar.signContract();
        proxyStar.bookTicket();
        proxyStar.sing();
        proxyStar.collect();
    }
}
