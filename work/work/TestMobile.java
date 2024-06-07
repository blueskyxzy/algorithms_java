package com.xzy.test;
// created by xzy on 2019-07-23

public class TestMobile {

    public static void main(String[] args) {
        String pattern = "1[0-9]{10}";
        String mobile = "1a656432607";
        if (mobile.matches(pattern)){
            System.out.println("手机号正确");
        } else {
            System.out.println("手机号不正确");
        }
    }
}
