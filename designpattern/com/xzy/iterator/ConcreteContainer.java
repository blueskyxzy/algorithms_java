package com.xzy.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xzy on 18/8/15  .
 */

// 自定义聚合类
public class ConcreteContainer implements Container{

    List<Object> list = new ArrayList<>();

    public ConcreteContainer(List<Object> list) {
        this.list = list;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    @Override
    public Iterator getIterator() {
        return null;
    }

    public void addObject(Object o){
        list.add(o);
    }

    public void removeObject(Object o){
        list.remove(o);
    }

    // 迭代器以内部类实现

    class ConcreteIterator implements Iterator{

        private int index;

        @Override
        public boolean hasNext() {
            if (index < list.size()){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()){
                return list.get(index++);
            } else {
                return null;
            }
        }

        @Override
        public Object first() {
            return list.get(0);
        }

        @Override
        public boolean isFirst() {
            return index == 0? true:false;
        }

        @Override
        public boolean isLast() {
            return index == list.size()-1 ? true:false;
        }

        @Override
        public Object getCurrentObj() {
            return list.get(index);
        }
    }
}
