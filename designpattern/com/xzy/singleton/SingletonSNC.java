package com.xzy.singleton;

/**
 * Created by xzy on 18/6/20  .
 */
// Static Nested Class方式
public class SingletonSNC {

    private static class SingleClassInstance{
        private static final SingletonSNC instance = new SingletonSNC();
    }

    private SingletonSNC(){
    }

    public static SingletonSNC getInstance(){
        return SingleClassInstance.instance;
    }
}
