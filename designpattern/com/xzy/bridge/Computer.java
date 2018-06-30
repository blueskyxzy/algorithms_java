package com.xzy.bridge;

/**
 * Created by xzy on 18/6/28  .
 */

public class Computer {

    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void sale(){
        brand.sale();
    }
}

class DeskTop extends Computer{

    public DeskTop(Brand brand) {
        super(brand);
    }

    public void sale(){
        System.out.println("台式电脑");
    }
}


class LapTop extends Computer{

    public LapTop(Brand brand) {
        super(brand);
    }

    public void sale(){
        super.sale();
        System.out.println("笔记本电脑");
    }
}

class Pad extends Computer{

    public Pad(Brand brand) {
        super(brand);
    }

    public void sale(){
        super.sale();
        System.out.println("Pad");
    }
}

