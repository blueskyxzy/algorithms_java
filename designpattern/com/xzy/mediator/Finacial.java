package com.xzy.mediator;

/**
 * Created by xzy on 18/8/16  .
 */

// 财务部
public class Finacial implements Department{

    private Mediator mediator;

    public Finacial(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("finacial",this);
    }

    @Override
    public void selfAction() {
        System.out.println("我在数钱");
    }

    @Override
    public void outAction() {
        System.out.println("财务上报");
    }
}
