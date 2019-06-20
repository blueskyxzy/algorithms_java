package com.xzy.test;
// created by xzy on 2019-06-20

import java.math.BigDecimal;

public class Test3 {

    public static void main(String[] args){
        BigDecimal money1 = new BigDecimal("10").setScale(2);
        BigDecimal money2 = new BigDecimal("10.101").setScale(2, BigDecimal.ROUND_HALF_UP);
        BigDecimal money3 = new BigDecimal("10.12").setScale(2, BigDecimal.ROUND_HALF_UP);
        BigDecimal money4 = new BigDecimal("10.2").setScale(2);

        System.out.println(money1);
        System.out.println(money2);
        System.out.println(money3);
        System.out.println(money4);
    }
}
