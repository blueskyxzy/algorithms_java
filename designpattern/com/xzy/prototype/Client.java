package com.xzy.prototype;

import java.util.Date;

/**
 * Created by xzy on 18/6/26  .
 */

// 浅复制（内存一样，引用一样，引用改了值也变了）
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        Sheep sheep1 = new Sheep("多利", date);
        System.out.println(sheep1);
        System.out.println("sname:" + sheep1.getSname());
        System.out.println("birthday:" + sheep1.getBirthday());
        sheep1.setBirthday(new Date(220000000000L));
        System.out.println("----------------------------");
        Sheep sheep2 = (Sheep) sheep1.clone();
        System.out.println(sheep2);
        System.out.println("sname:" + sheep2.getSname());
        System.out.println("birthday:" + sheep2.getBirthday());
    }
}
