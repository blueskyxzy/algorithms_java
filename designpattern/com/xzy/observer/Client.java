package com.xzy.observer;

/**
 * Created by xzy on 18/8/18  .
 */

public class Client {
    public static void main(String[] args){
        ConcreteSubject subject = new ConcreteSubject();

        ObserverA a = new ObserverA();
        ObserverA b = new ObserverA();
        ObserverA c = new ObserverA();

        subject.registerOberver(a);
        subject.registerOberver(b);
        subject.registerOberver(c);

        // 改变目标状态
        subject.setState(100);

        System.out.println(a.getMyState());
        System.out.println(b.getMyState());
        System.out.println(c.getMyState());

        // 改变目标状态
        subject.setState(1000);

        System.out.println(a.getMyState());
        System.out.println(b.getMyState());
        System.out.println(c.getMyState());


        System.out.println("-----------------");

        JavaConcreteSubject sub = new JavaConcreteSubject();
        JavaObserverA x = new JavaObserverA();
        JavaObserverA y = new JavaObserverA();
        JavaObserverA z = new JavaObserverA();

        sub.addObserver(x);
        sub.addObserver(y);
        sub.addObserver(z);

        // 改变目标状态
        sub.setState(500);

        System.out.println(x.getMyState());
        System.out.println(y.getMyState());
        System.out.println(z.getMyState());

    }
}
