package com.xzy.iterator;


/**
 * Created by xzy on 18/6/26  .
 */

public class Client {

    public static void main(String[] args){
        ConcreteContainer concreteContainer = new ConcreteContainer();
        concreteContainer.addObject("aa");
        concreteContainer.addObject("bb");
        concreteContainer.addObject("cc");
        Iterator iterator = concreteContainer.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
