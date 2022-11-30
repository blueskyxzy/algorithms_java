package com.xzy.nowcoder.jianzhioffer;
// created by xzy on 2019/5/5

    /*
    在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
        请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
    */


//   二维数组中的查找
public class Test01 {

    public static void main(String[] args) {
        int [][]array = {{1,3,5,6},
                         {2,4,7,8},
                         {5,6,10,12}};
        boolean result = Find(7, array);

    }

    public static boolean Find(int target, int [][] array) {
        boolean result = false;
        for(int i = 0;i < array.length;i++)
            for(int j = 0;j < array[i].length; j++){
                if(target == array[i][j]){
                    result = true;
                    break;
                }
            }
        return result;
    }
}
