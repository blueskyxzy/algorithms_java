package com.xzy.command;


/**
 * Created by xzy on 18/8/17  .
 */

public class Client {

    public static void main(String[] args){
        Command c = new ConcreteCommand(new Reciver());
        Invoke invoke = new Invoke(c);
        invoke.call();

        // 相当于 new Reciver().action(); 但是用这个模式会方便扩展

    }
}
