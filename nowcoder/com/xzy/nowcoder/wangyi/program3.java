package com.xzy.nowcoder.wangyi;

import java.util.Scanner;

/**
 * Created by xzy on 18/12/28  .
 */

//字符串替换（10 分）
//        输入格式:
//        Xi’an Institute of Posts and Telecommunications is co-designed and implemented by the People’s Government of Shaanxi Province and the Ministry of Industry and Information Technology.
//        The Institute is located in Xi’an, a historic city in Northwest China, famous for its magnificent ancient culture.
//        end （表示结束） Institute （第一个字符串，要求用第二个字符串替换） University （第二个字符串）
//
//        输出格式:
//        Xi’an University of Posts and Telecommunications is co-designed and implemented by the People’s Government of Shaanxi Province and the Ministry of Industry and Information Technology.The University is located in Xi’an, a historic city in Northwest China, famous for its magnificent ancient culture.
//
//        输入样例:
//
//        Xi’an Institute of Posts and Telecommunications is co-designed and implemented by the People’s Government of Shaanxi Province and the Ministry of Industry and Information Technology.
//        The Institute is located in Xi’an, a historic city in Northwest China, famous for its magnificent ancient culture.
//        end
//        Institute
//        University
//        输出:
//        Xi’an University of Posts and Telecommunications is co-designed and implemented by the People’s Government of Shaanxi Province and the Ministry of Industry and Information Technology.The University is located in Xi’an, a historic city in Northwest China, famous for its magnificent ancient culture.

public class program3 {

    public static  void main(String[] args){
        Scanner s = new Scanner(System.in);
        // 多行以end为结束标志
        String strs = "";
        String str = "";
        while(!str.equals("end")){
            str = s.nextLine();
            strs = strs + str;
        }
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        System.out.println(strs.replaceAll(s1, s2));
    }

}
