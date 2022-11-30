package com.xzy.state;

public interface State {
    void handle();
}

class FreeState implements State{

    @Override
    public void handle() {
        System.out.println("空闲");
    }
}

class BookedState implements State{

    @Override
    public void handle() {
        System.out.println("已预定");
    }
}

class CheckedState implements State{

    @Override
    public void handle() {
        System.out.println("已入住");
    }
}
