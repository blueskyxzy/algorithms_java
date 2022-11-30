package com.xzy.state;

/**
 * Created by xzy on 18/8/16  .
 */

public class Context {


    private State state;

    public void setState(State state) {
        this.state = state;
        System.out.println("修改状态");
        state.handle();
    }


}
