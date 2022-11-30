package com.xzy.nowcoder.jianzhioffer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xzy on 2019/8/27  .
 */

public class Test21 {

//   举例让抽象具体化
//   栈的压入、弹出序列

//   输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
//   假设压入栈的所有数字均不相等。
//   例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
//  （注意：这两个序列的长度是相等的）
    public static void main(String[] args) {
        int [] pushA = {1,2,3,4,5};
        int [] pop1 = {4,5,3,2,1}; // 是
        int [] pop2 = {4,3,5,1,2}; // 不是
        int [] pop3 = {3,5,4,2,1}; // 是
//        [1],[2]
        int [] pushB = {1};
        int [] popB1 = {2}; // 是
      /*  boolean b1 = IsPopOrder(pushA, pop1);
        if (b1){
            System.out.println("是");
        } else {
            System.out.println("不是");
        }*/
        boolean b2 = IsPopOrder(pushB, popB1);
        if (b2){
            System.out.println("是");
        } else {
            System.out.println("不是");
        }
    }

    // 每个元素的 在之前入栈的必然在后面按先入后出顺序出栈，个数可以少，顺序不能乱。 后入栈的不用管
    public static boolean IsPopOrder(int [] pushA, int [] popA) {
        int length = popA.length;
        // 压栈的数字都不相等
        for(int i=0; i<=length - 1;i++){
            int pop = popA[i];
            int j = 0; // 当前出栈的入栈序号
            for(int k=0; k<length;k++){
                if (pop == pushA[k]){
                    j = k;
                }
            }
            List<Integer>  list = new ArrayList<>();
            for(int x= i+1; x<length; x++){
                // x是出栈序号，z是对应的入栈序号
                int z = -1;
                for(int y=0; y<length;y++){
                    if (popA[x] == pushA[y]){
                        z = y;
                    }
                }
                if (z == -1){
                    return false;
                }
                if (z < j){
                    list.add(pushA[z]);
                }
            }
            // 后面出栈的的先入栈序号必须按顺序排序
            if (list !=null && list.size()>1){
                int size = list.size();
                for (int r = 0; r < size; r++){
                    for (int t = r + 1; t < size; t++){
                        if (list.get(t) > list.get(r)){
                            return false;
                        }
                    }
                }
            }
            boolean hasPop = false;
            for(int y=0; y<length;y++){
                if ( pop == pushA[y]){
                  hasPop = true;
                }
            }
            if (!hasPop){
                return false;
            }
        }
        return true;
    }
}
