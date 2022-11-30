package com.xzy.algorithms;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;

/**
 * created by xzy on 2019-01-28
 **/

// 动态规划求最短路径
public class minPath {

    static class Node{
        public Node(int number, int value, int parent) {
            this.number = number;
            this.value = value;
            this.parent = parent;
        }

        //value是指从0到这个节点总共要走多远，执行算法前将value的值初始化为无穷大
        public int value;
        public int parent;
        public int number;

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getParent() {
            return parent;
        }

        public void setParent(int parent) {
            this.parent = parent;
        }


        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", parent=" + parent +
                    ", number=" + number +
                    '}';
        }
    }

    public static void sort(int[][] arrs) {
        // 6个顶点 初始化 备忘录记录，不用递归了
        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i < arrs.length; i++){
            Node node = new Node(i, Integer.MAX_VALUE, i);
            nodes.add(node);
        }
        Node node = nodes.get(0);
        node.setValue(0);

        // 从矩阵a的第一行开始，一行行找相连的节点
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                // 找到了相连节点
                if(arrs[i][j] != 0){
                    // 上一个节点的最短路径的值+与下一个节点相连路径上的值
                    int d = nodes.get(i).value + arrs[i][j];
                    // 判断是否比原先的值要小，如果小就将0-j节点的长度替换
                    if(d < nodes.get(j).value){
                        nodes.get(j).value = d;
                        // 记录前一个节点的序号
                        nodes.get(j).parent = i;
                    }
                }
            }
        }
        for(Node n: nodes){
            System.out.println(n.toString());
        }
    }
}
