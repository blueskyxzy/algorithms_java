package com.xzy.test;

import java.util.HashSet;
import java.util.Set;

/**
 * created by xzy on 2019-02-27
 **/

public class Test1 {


    public static void main(String[] args){
//        String str = "/西溪园区/测试楼/1F/1F-2/";
//        String substr = str.substring(1);
//        String[] strs = substr.split("/");
//        System.out.println("size:" + strs.length);
//        int i = 1;
//        for (String s:strs){
//            System.out.println(String.valueOf(i++) + ":" + s);
//        }

//        String spaceUnitNamePath = "/西溪园区/测试楼/1F/1F-2/";
//        spaceUnitNamePath = spaceUnitNamePath.substring(0, spaceUnitNamePath.length() - 1);
//        int floorEndIndex = spaceUnitNamePath.lastIndexOf("/");
//        String floorNamePath = spaceUnitNamePath.substring(0, floorEndIndex);
//        int buildingEndIndex = floorNamePath.lastIndexOf("/");
//        String buildingNamePath = spaceUnitNamePath.substring(0, buildingEndIndex);
//        System.out.println(floorNamePath);
//        System.out.println(buildingNamePath);

       Set<String> set = new HashSet<>();
       set.add("/西溪园区/测试楼/");
       set.add("/西溪园区/1楼/");
       set.add("/西溪园区/测试楼/");
       for(String str: set){
           System.out.println("::" +str);
       }


    }
}

