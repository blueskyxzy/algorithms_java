package com.xzy.command;

public interface Command {
    // 实际可以多个方法
    void execute();
}

class ConcreteCommand implements Command{

    private Reciver reciver;

    public ConcreteCommand(Reciver reciver) {
        this.reciver = reciver;
    }

    @Override
    public void execute() {
        // before的处理
        reciver.action();
        // after的处理
    }
}