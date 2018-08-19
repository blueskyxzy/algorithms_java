package com.xzy.observer;

/**
 * Created by xzy on 18/8/18  .
 */

public class ObserverA implements Observer{

    private int myState; // 和subject的状态state保持一致

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }


    @Override
    public void update(Subject subject) {
        myState = ((ConcreteSubject)subject).getState();
    }
}
