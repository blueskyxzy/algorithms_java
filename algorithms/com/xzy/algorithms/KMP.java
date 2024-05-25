package com.xzy.algorithms;

/**
 * @author: xzy
 * @create: 2024-05-25
 **/

public class KMP {
    public static void main(String[] args) {
        String nn = "ABCABCAABCABCD";
        String mm = "ABCABCD";
        int[] next = new int[mm.length()];
        get_next(mm.toCharArray(), next);
        int result = search(nn.toCharArray(), mm.toCharArray(), next);
    }

    private static int search(char[] nn, char[] mm, int[] next) {
        int i=0;
        int j=0;
        // -1 0 0 0 1 2 3
        while (i < nn.length && j < mm.length){
            if (j==-1 || nn[i] == mm[j]){
                i++;
                j++;
            } else {
                j = next[j];
            }
        }

        if (j == mm.length){
            return  i - j;
        } else {
            return -1;
        }
    }

    static void get_next(char[] pattern, int next[]) {
        next[0] = -1;
        int i = 0;
        int j = -1;
        while (i < pattern.length) {
            if (j == -1){
                i++; j++;
            } else if (pattern[i] == pattern[j]){
                i++; j++;
                next[i] = j;
            } else {
                j = next[j];
            }
        }
    }


}
