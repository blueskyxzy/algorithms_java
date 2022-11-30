package com.xzy.nowcoder.wangyi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by xzy on 18/12/28  .
 */

//查找电话号码（10 分）
//        文件phonebook1.txt中有若干联系人的姓名和电话号码。 高富帅 13312342222 白富美 13412343333 孙悟空 13512345555 唐三藏 13612346666 猪悟能 13712347777 沙悟净 13812348888 请你编写一个简单的通信录程序，当从键盘输入一个姓名时查找到对应的电话号码并输出。如果没找到则显示Not found.
//        由于目前的自动裁判系统暂时不能支持用户读入文件，我们编写程序从键盘输入文件中的姓名和电话号码，当输入的名字为noname时，表示结束。noname后面有一个名字，需要查找其对应的电话号码。
//
//        输入格式:
//        高富帅 13312342222 白富美 13412343333 孙悟空 13512345555 唐三藏 13612346666 猪悟能 13712347777 沙悟净 13812348888 noname （表示结束） 唐三藏 （需要查找此人的电话号码）
//
//        输出格式:
//        13612346666 （输出对应的电话号码）
//
//        输入样例:
//
//        白富美 13412343333
//        孙悟空 13512345555
//        唐三藏 13612346666
//        猪悟能 13712347777
//        沙悟净 13812348888
//        noname
//        白骨精
//
//        输出样例：
//
//        Not found.

public class program5 {

    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);

        Map<String,String> list = new HashMap<String, String>();
        String name;
        String telphone;
        name = input.next();
        while (!name.equals("noname")) {
            telphone = input.next();
            list.put(name, telphone);
            name = input.next();
        }
        String aim = input.next();
        if (list.get(aim) != null) {
            System.out.println(list.get(aim));
        }
        else {
            System.out.println("Not found.");
        }
    }
}
