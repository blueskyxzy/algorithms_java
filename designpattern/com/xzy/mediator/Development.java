package com.xzy.mediator;

/**
 * Created by xzy on 18/8/16  .
 */
// 研发部
public class Development implements Department{

    private Mediator mediator; //中介者引用

    public Development(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("development",this);
    }

    @Override
    public void selfAction() {
        System.out.println("selfAction,专心工作，开发");
    }

    @Override
    public void outAction() {
        System.out.println("outAction，没钱了，要钱");
        mediator.command("finacial");
    }
}
