package com.xzy.leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author: xzy
 * @create: 2024-03-23
 *
 * 请你设计并实现一个满足  LRU (最近最少使用) 缓存 约束的数据结构。
 * 实现 LRUCache 类：
 * LRUCache(int capacity) 以 正整数 作为容量 capacity 初始化 LRU 缓存
 * int get(int key) 如果关键字 key 存在于缓存中，则返回关键字的值，否则返回 -1 。
 * void put(int key, int value) 如果关键字 key 已经存在，则变更其数据值 value ；如果不存在，则向缓存中插入该组 key-value 。如果插入操作导致关键字数量超过 capacity ，则应该 逐出 最久未使用的关键字。
 * 函数 get 和 put 必须以 O(1) 的平均时间复杂度运行。
 **/

public class Leet0146 {

    public static void main(String[] args) {

    }

}

// 使用单向链表是O(n)，双向链表O(1)
class LRUCache {

    Map<Integer, DLinkedNode> cache;

    int size;

    int capacity;

    // 双向链表
    DLinkedNode head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>(capacity);
        size = 0;
        head = new DLinkedNode();
        tail = new DLinkedNode();
        head.next = tail;
        tail.pre = head;
    }


    public int get(int key) {
        DLinkedNode dLinkedNode = cache.get(key);
        if (dLinkedNode == null){
            return -1;
        }
        // 放入头部
        moveToHead(dLinkedNode);
        return dLinkedNode.value;
    }

    // 插入数据结构并更新访问顺序
    public void put(int key, int value) {
        DLinkedNode node = cache.get(key);
        if (node == null) {
            // 新的节点
            DLinkedNode newNode = new DLinkedNode(key, value);
            cache.put(key, newNode);
            // 添加至双向链表的头部
            addToHead(newNode);
            ++size;
            if (size > capacity) {
                // 如果超出容量，删除双向链表的尾部节点
                DLinkedNode tail = removeTail();
                // 删除哈希表中对应的项
                cache.remove(tail.key);
                --size;
            }
        }
        else {
            // 如果 key 存在，先通过哈希表定位，再修改 value，并移到头部
            node.value = value;
            moveToHead(node);
        }
    }

    private void addToHead(DLinkedNode node) {
        node.pre = head;
        node.next = head.next;
        head.next.pre = node;
        head.next = node;
    }

    private void removeNode(DLinkedNode node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    private void moveToHead(DLinkedNode node) {
        removeNode(node);
        addToHead(node);
    }

    private DLinkedNode removeTail() {
        DLinkedNode res = tail.pre;
        removeNode(res);
        return res;
    }

    class DLinkedNode {
        int key;
        int value;
        DLinkedNode pre;
        DLinkedNode next;

        DLinkedNode(int key, int value){
            this.key = key;
            this.value = value;
        }

        public DLinkedNode() {

        }
    }
}

// 使用LinkedHashMap，底层是双向链表
/*每次插入、删除后，都会调用一个函数来进行 双向链表的维护 ，准确的来说，是有三个函数来做这件事，这三个函数都统称为 回调函数 ，这三个函数分别是：

        void afterNodeAccess(Node<K,V> p) { }
        其作用就是在访问元素之后，将该元素放到双向链表的尾巴处(所以这个函数只有在按照读取的顺序的时候才会执行)，之所以提这个，是建议大家去看看，如何优美的实现在双向链表中将指定元素放入链尾！
        void afterNodeRemoval(Node<K,V> p) { }
        其作用就是在删除元素之后，将元素从双向链表中删除，还是非常建议大家去看看这个函数的，很优美的方式在双向链表中删除节点！
        void afterNodeInsertion(boolean evict) { }
        这个才是我们题目中会用到的，在插入新元素之后，需要回调函数判断是否需要移除一直不用的某些元素！*/
class LRUCach extends LinkedHashMap<Integer, Integer> {
    private int capacity;

    public LRUCach(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    // 这个可不写
    public void put(int key, int value) {
        super.put(key, value);
    }

    // removeEldestEntry是afterNodeInsertion的子方法
    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }
}
