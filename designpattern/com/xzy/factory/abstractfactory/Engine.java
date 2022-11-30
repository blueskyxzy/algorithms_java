package com.xzy.factory.abstractfactory;

public interface Engine {
    void run();
    void start();
    void stop();
}

class LuxuryEngine implements Engine{

    @Override
    public void run() {
        System.out.println("跑的快");
    }

    @Override
    public void start() {
        System.out.println("启动快");
    }

    @Override
    public void stop() {
        System.out.println("启停快");
    }
}


class LowEngine implements Engine{

    @Override
    public void run() {
        System.out.println("跑的慢");
    }

    @Override
    public void start() {
        System.out.println("启动慢");
    }

    @Override
    public void stop() {
        System.out.println("启停慢");
    }
}