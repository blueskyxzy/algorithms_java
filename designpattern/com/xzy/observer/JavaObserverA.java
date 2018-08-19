package com.xzy.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by xzy on 18/8/18  .
 */

public class JavaObserverA implements Observer{

    private int myState;

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }

    @Override
    public void update(Observable o, Object arg) {
        myState = ((JavaConcreteSubject) o).getState();


    }
}
