package com.xzy.mediator;

/**
 * Created by xzy on 18/8/16  .
 */
// 市场部
public class Market implements Department{

    private Mediator mediator; //中介者引用

    public Market(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("market",this);
    }

    @Override
    public void selfAction() {
        System.out.println("接项目");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作");
        mediator.command("finacial");
    }
}
