package com.xzy.observer;

/**
 * Created by xzy on 18/8/18  .
 */

public class ConcreteSubject extends Subject{

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;

        // 状态变化通知所有观察者
        this.notifyObservers();
    }

}
