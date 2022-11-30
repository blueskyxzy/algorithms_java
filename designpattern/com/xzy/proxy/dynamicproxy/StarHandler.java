package com.xzy.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by xzy on 18/6/27  .
 */

// 动态代理

public class StarHandler implements InvocationHandler{

    public StarHandler(Star star) {
        this.star = star;
    }

    Star star;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj = null;
        if ("sing".equals(method.getName())){
            System.out.println("唱歌啦");
            obj = method.invoke(star, args);
        } else {
            obj = method.invoke(star,args);
        }
        return obj;
    }
}
