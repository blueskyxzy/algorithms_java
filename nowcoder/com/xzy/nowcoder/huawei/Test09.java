package com.xzy.nowcoder.huawei;

import java.util.Scanner;

/**
 * @author: xzy
 * @create: 2024-05-28
 *
 * 5G基站建设
 * 1到n,每个节点要有连接，并且互联网可达
 * 第一行输入n，
 * 第二行输入能连接基站对数目M
 * 第三行输入M行数据
 * X Y Z P   x,y对应站点， z是成本，P是是否已存在，0未连接，1已连接
 *
 * 输出最小建设成本，没法建设输出-1
 **/

public class Test09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 方法一
        // 最小生成树
        // 无相连通图，生成树是包含全部顶点的极小连通子图， n个顶点， n-1条边
        // Prim算法是基于顶点找最小生成树，Kruskal是基于边找最小生成树
        // prim一个个找最小的，并判断是否生成环，不能成环  ,
        // Kruskal是所有边按照权重升序排序，依次加入，并集查，也不能成环，基于边

        // 数据结构 int[][] graph = new int[n+1][N+1],初始化每个节点边都是Integer.Max_value,已经连通的边设置为0
        // boolean[] inTree 判断是否在最小生成树中






    }
}
