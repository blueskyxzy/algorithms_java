package com.xzy.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * Created by xzy on 18/6/20  .
 */
// 反射破解单例模式   单例继承Serializable
public class Client {
    public static void  main(String[] args ) throws Exception {
        SingletonLHS instance1 = SingletonLHS.getInstance();
        SingletonLHS instance2 = SingletonLHS.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);

        // 反射破解单例
//        Class<SingletonLHS> clazz = (Class<SingletonLHS>) Class.forName("com.xzy.singleton.SingletonLHS");
//
//        Constructor<SingletonLHS> declaredConstructor = clazz.getDeclaredConstructor(null);
//
//        declaredConstructor.setAccessible(true);// 可访问私有
//
//        SingletonLHS s1 = declaredConstructor.newInstance();
//        SingletonLHS s2 = declaredConstructor.newInstance();
//
//        System.out.println(s1);  //s1和s2是新对象
//        System.out.println(s2);

        // 反序列化构造多个对象，破解单例
        // 序列化，存对象
        FileOutputStream fos = new FileOutputStream("/Users/xzy/MyWork/a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(instance1);
        oos.close();
        fos.close();

        // 反序列化，读对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/xzy/MyWork/a.txt"));
        SingletonLHS s1 = (SingletonLHS) ois.readObject();

        System.out.println(s1);  //s1和s2是新对象
    }
}
