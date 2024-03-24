package com.xzy.nowcoder.coder;

import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author: xzy
 * @create: 2023-11-28
 *
 * BM47 寻找第K大
 * 题目
 *有一个整数数组，请你根据快速排序的思路，找出数组中第 k 大的数。
 * 给定一个整数数组 a ,同时给定它的大小n和要找的 k ，请返回第 k 大的数(包括重复的元素，不用去重)，保证答案存在。
 * 输入：
 * [1,3,5,2,2],5,3
 * 复制
 * 返回值：
 * 2
 *
 * 输入：
 * [10,10,9,9,8,7,5,6,4,3,4,2],12,3
 * 复制
 * 返回值：
 * 9
 * 复制
 * 说明：
 * 去重后的第3大是8，但本题要求包含重复的元素，不用去重，所以输出9
 *
 *
 * 2个问题：
 * 第一个找第K个
 * 第二个找前K个
 **/



public class BM47 {
    public static void main(String[] args) {
        int[] arr = {10, 9, 9, 8, 7, 5, 6, 4, 3, 4, 2};
        Solution solution = new Solution();
        int kth = solution.findKth(arr, arr.length, 3);
        int[] ints = solution.smallestK(arr, 3);
        int[] inta = solution.bigestK(arr, 3);
        System.out.println("result:" + kth);
    }


    public static class Solution {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         *
         * @param a int整型一维数组
         * @param n int整型
         * @param K int整型
         * @return int整型
         */
        public int findKth (int[] a, int n, int K) {
            // write code here
            // 优先级队列构建小顶堆
            PriorityQueue<Integer> minHeap = new PriorityQueue<>(K);
            for (int i = 0; i < n ; i++) {
                if (i < K) {
                    minHeap.offer(a[i]);//入堆
                } else {
                    int val = a[i];
                    if (val > minHeap.peek()) {
                        minHeap.poll();
                        minHeap.offer(a[i]);
                    }
                }
            }
            return minHeap.peek();
        }


        /*时间复杂度：O(N + O(K * logN)),建堆的时间复杂度是O(N)，弹出k个元素每次弹出
         * 都需要向上调整，时间复杂度：O(K * logN)*/
        public int[] smallestK(int[] arr, int k) {
            //1.建立一个小根堆
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            //2.取出数组中的每一个元素放到堆中
            for (int i = 0; i < arr.length; i++) {
                minHeap.offer(arr[i]);
            }
            int[] tmp = new int[k];
            //3.弹出k个元素放进数组中
            for (int i = 0; i < k; i++) {
                tmp[i] = minHeap.poll();
            }
            return tmp;
        }

        public int[] bigestK(int[] arr, int k) {
            //1.建立一个大根堆
            PriorityQueue<Integer> bigHeap = new PriorityQueue<>(k, Comparator.comparing(o -> -o));
            //2.取出数组中的每一个元素放到堆中
            for (int i = 0; i < arr.length; i++) {
                bigHeap.offer(arr[i]);
            }
            int[] tmp = new int[k];
            //3.弹出k个元素放进数组中
            for (int i = 0; i < k; i++) {
                tmp[i] = bigHeap.poll();
            }
            return tmp;
        }
    }
}
