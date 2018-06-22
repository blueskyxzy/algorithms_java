package com.xzy.singleton;

/**
 * Created by xzy on 18/6/20  .
 */
// 饿汉式
// 不需要同步，效率高，立即加载
public class SingletonEHS {

    private static final SingletonEHS s = new SingletonEHS();

    private SingletonEHS(){
    }

    public static SingletonEHS getInstance(){
        return s;
    }
}
