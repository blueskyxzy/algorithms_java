package com.xzy.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xzy on 18/8/18  .
 */

public class Subject {

    List<Observer> list = new ArrayList<>();

    public void registerOberver(Observer observer){
        list.add(observer);
    }

    public void removeOberver(Observer observer){
        list.remove(observer);
    }

    // 通知观察者
    public void notifyObservers(){
        for(Observer observer:list){
            observer.update(this);
        }
    }

}
