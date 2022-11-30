package com.xzy.test;

/**
 * created by xzy on 2019-02-26
 **/

public class TestSplit {

    public static void main(String[] args){
        String str = "/杭州昌如/测试楼/1F/1F-2/";
        String substr = str.substring(1);
        String[] strs = substr.split("/");
        System.out.println("size:" + strs.length);
        int i = 1;
        for (String s:strs){
            System.out.println(String.valueOf(i++) + ":" + s);
        }

    }
}
