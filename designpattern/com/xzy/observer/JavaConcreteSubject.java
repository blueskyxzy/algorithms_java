package com.xzy.observer;

import java.util.Observable;

/**
 * Created by xzy on 18/8/18  .
 */

public class JavaConcreteSubject extends Observable{

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;

        setChanged(); //目标更改
        notifyObservers(this);
    }


}
