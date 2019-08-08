package com.xzy.test;
// created by xzy on 2019-06-20

import java.math.BigDecimal;

public class Test3 {

    public static void main(String[] args){
    /*    BigDecimal money1 = new BigDecimal("10").setScale(2);
        BigDecimal money2 = new BigDecimal("10.101").setScale(2, BigDecimal.ROUND_HALF_UP);
        BigDecimal money3 = new BigDecimal("10.12").setScale(2, BigDecimal.ROUND_HALF_UP);
        BigDecimal money4 = new BigDecimal("10.2").setScale(2);

        System.out.println(money1);
        System.out.println(money2);
        System.out.println(money3);
        System.out.println(money4);*/

        BigDecimal money5 = null;
        BigDecimal money6 = new BigDecimal("0.00");
        BigDecimal money7 = new BigDecimal("0.01");
        BigDecimal money = money7;
        if (money == null || money.compareTo(BigDecimal.ZERO) == 0){
            System.out.println("11111");
        } else {
            System.out.println("22222");
        }

//        Short mlmState = null;
//        if (mlmState !=null){
//            if (0 != mlmState){
//                System.out.println("111111");
//            }
//            System.out.println("2222222");
//        }
//        System.out.println(3333);



    }
}
