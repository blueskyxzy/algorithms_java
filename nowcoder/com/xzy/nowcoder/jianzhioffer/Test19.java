package com.xzy.nowcoder.jianzhioffer;

import java.util.ArrayList;

/**
 * Created by xzy on 2019/8/22  .
 */

// 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
// 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.

// 画图让抽象形象化
// 顺时针打印矩阵
public class Test19 {

    public static void main(String[] args) {
        int [][] matrix =
                {{1, 2, 3, 4},
                 {5, 6, 7, 8},
                 {9, 10, 11, 12},
                 {13, 14, 15, 16}};
        int [][] test2 =
                {{1, 2, 3, 4, 5}};
        int [][] test3 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        ArrayList<Integer> arrayList = printMatrix(matrix);
        if (arrayList != null) {
            for (Integer result : arrayList) {
                System.out.println(result);
            }
        } else {
            System.out.println("null");
        }

    }

    // 按圈 循环， 每圈按照左上和右下两个标志位统计
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        if (matrix == null){
            return null;
        }
        ArrayList<Integer> result = new ArrayList<>();
        int x = matrix.length;
        int y = matrix[0].length;
        int i1 = 0, i2 = 0;
        int j1= x- 1, j2 = y - 1;
        for(;i1 <= j1 && i2 <= j2; i1++, i2++, j1--,j2--){
            for (int b = i2; b <=j2 && b < y; b++){
                result.add(matrix[i1][b]);
            }
            for (int a = i1+1; a <= j1 && a < x; a++){
                result.add(matrix[a][j2]);
            }
            for (int b = j2 - 1; b >= i2 && (i1<=j1-1); b--){
                result.add(matrix[j1][b]);
            }
            for (int a = j1 - 1; a >= i1 + 1 && (i2<=j2-1); a--){
                result.add(matrix[a][i2]);
            }
        }
        return result;
    }

}
