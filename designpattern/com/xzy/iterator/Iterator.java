package com.xzy.iterator;

/**
 * Created by xzy on 18/8/15  .
 */

// 迭代器接口
public interface Iterator {

    boolean hasNext();

    Object next();

    Object first();

    boolean isFirst();

    boolean isLast();

    Object getCurrentObj();

}
