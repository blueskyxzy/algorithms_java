package com.xzy.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Created by xzy on 18/6/20  .
 */
// 懒汉式
public class SingletonLHS implements Serializable{

    private  static SingletonLHS s;

    private SingletonLHS(){
        if (s != null){  // 多次调用抛出异常，以免反射破解单例
            throw new RuntimeException();
        }
    }

    public static synchronized SingletonLHS getInstance(){
        if (s == null){
            s = new SingletonLHS();
        }
        return s;
    }

    // 反序列化时，如果定义了readResolve()则返回指定对象
    private Object readResolve() throws ObjectStreamException{
        return s;
    }
}
