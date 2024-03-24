package com.xzy.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author: xzy
 * @create: 2024-03-22
 * <p>
 * 请你为 最不经常使用（LFU）缓存算法设计并实现数据结构。
 * <p>
 * 实现 LFUCache 类：
 * <p>
 * LFUCache(int capacity) - 用数据结构的容量 capacity 初始化对象
 * int get(int key) - 如果键 key 存在于缓存中，则获取键的值，否则返回 -1 。
 * void put(int key, int value) - 如果键 key 已存在，则变更其值；如果键不存在，请插入键值对。当缓存达到其容量 capacity 时，则应该在插入新项之前，移除最不经常使用的项。在此问题中，当存在平局（即两个或更多个键具有相同使用频率）时，应该去除 最久未使用 的键。
 * 为了确定最不常使用的键，可以为缓存中的每个键维护一个 使用计数器 。使用计数最小的键是最久未使用的键。
 * <p>
 * 当一个键首次插入到缓存中时，它的使用计数器被设置为 1 (由于 put 操作)。对缓存中的键执行 get 或 put 操作，使用计数器的值将会递增。
 * <p>
 * 函数 get 和 put 必须以 O(1) 的平均时间复杂度运行。
 **/

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

public class Leet0460 {

    public static void main(String[] args) {

    }

    // 小根堆
    class LFUCache {

        Map<Integer, Node> map;

        Queue<Node> queue;

        int capacity;

        int size;

        int idx; // 自增，用于标识访问时间先后

        public LFUCache(int capacity) {
            map = new HashMap<>();
            queue = new PriorityQueue<>(capacity);
            this.capacity = capacity;
            size = 0;
            idx = 0;
        }

        public int get(int key) {
            if (size <= 0) {
                return -1;
            }
            Node node = map.get(key);
            if (node == null) {
                return -1;
            }
            // 更新访问频次和小顶堆
            node.times += 1;
            node.idx += 1;
            queue.remove(node);
            queue.offer(node);
            return node.value;
        }

        public void put(int key, int value) {
            if (capacity == 0) {
                return;
            }
            Node node = map.get(key);
            if (node == null) {
                // 新node
                Node newNode = new Node(key, value, idx++);
                if (size >= capacity) {
                    // 达到最大容量移除访问频率最低的节点
                    map.remove(queue.poll().key);
                    map.put(key, newNode);
                    queue.offer(newNode);
                } else {
                    // 没达到最大容量
                    queue.offer(newNode);
                    map.put(key, newNode);
                    size++;
                }
            } else {
                // 已存在的节点，增加访问次数，刷新访问时间
                node.value = value;
                node.times += 1;
                node.idx += 1;
                idx += 1;
                // 更新小顶堆
                queue.remove(node);
                queue.offer(node);
            }

        }
    }

    class Node implements Comparable<Node> {
        int key;
        int value;
        int times; // 使用频率
        int idx;// 访问时间

        public Node(int key, int value, int idx) {
            this.key = key;
            this.value = value;
            times = 0;
            this.idx = idx;
        }

        @Override
        public int compareTo(Node node) {
            // 先比较访问次数再比较访问时间
            int diff = times - node.times;
            return diff != 0 ? diff : idx - node.idx;
        }
    }


}
