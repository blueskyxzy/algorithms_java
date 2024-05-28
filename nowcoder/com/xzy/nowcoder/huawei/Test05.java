package com.xzy.nowcoder.huawei;

import java.util.Scanner;

/**
 * @author: xzy
 * @create: 2024-05-27
 *
 * 某个产品的 RESTful API 集合部署在服务器集群的多个节点上，近期对客户端访问日志进行
 * 了采集，需要统计各个 API 的访问频次，根据热点信息在服务器节点之间做负载均衡，现在
 * 需要实现热点信息统计查询功能。
 * RESTful API 的由多个层级构成，层级之间使用 / 连接，如 /A/B/C/D 这个地址，A 属于第一
 * 级，B 属于第二级，C 属于第三级，D 属于第四级。
 * 现在负载均衡模块需要知道给定层级上某个名字出现的频次，未出现过用 0 次表示，实现这
 * 个功能。
 * 输入描述：
 * 第一行为 N，表示访问历史日志的条数，。
 * 接下来 N 行，每一行为一个 RESTful API 的 URL 地址，约束地址中仅包含英文字母和连接符/，
 * 最大层级为 10，每层级字符串最大长度为 10。
 * 最后一行为层级 L 和要查询的关键字。
 * 输出描述：
 * 输出给定层级上，关键字出现的频次，使用完全匹配方式（大小写敏感）。
 * 示例 1
 * 输入：
 * 5
 * /huawei/computing/no/one
 * /huawei/computing
 * /huawei
 * /huawei/cloud/no/one
 * /huawei/wireless/no/one
 * 2 computing
 * 输出：
 * 2
 * 说明：
 * 在第二层级上，computing 出现了 2 次，因此输出 2. 示例 2
 * 输入：
 * 5
 * /huawei/computing/no/one
 * /huawei/computing
 * /huawei
 * /huawei/cloud/no/one
 * /huawei/wireless/no/one
 * 4 two
 * 输出：
 * 0
 * 说明：
 * 存在第四层级的 URL 上，没有出现 two，因此频次是 0
 **/

public class Test05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 方式一双map结构，保存每个层级的map并计数，Map<Integer, Map<Integer, Integer>>
        // 方式二第一层数组，里面是Map  ArrayList<Map<Integer, Integer>>

    }

}
