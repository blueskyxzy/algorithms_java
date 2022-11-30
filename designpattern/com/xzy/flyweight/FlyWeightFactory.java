package com.xzy.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xzy on 18/7/4  .
 */

public class FlyWeightFactory {

    private static Map<String,ConcreteFlyWeight> map = new HashMap<>(); // 享元池,容器

    public static ConcreteFlyWeight get(String color){
        if (map.get(color) != null){
            return map.get(color);
        } else {
            ConcreteFlyWeight flyWeight = new ConcreteFlyWeight(color);
            map.put(color,flyWeight);
            return flyWeight;
        }
    }
}
