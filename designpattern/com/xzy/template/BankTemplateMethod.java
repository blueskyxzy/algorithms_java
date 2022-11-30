package com.xzy.template;

/**
 * Created by xzy on 18/8/16  .
 */

public abstract class BankTemplateMethod {

    public final void process(){
        this.takeNumber();
        this.transact(); // 相当于钩子方法，挂哪个子类调哪个  方法回调
        this.evaluate();
    }

    private void evaluate() {
        System.out.println("反馈评分");
    }

    // 办理具体业务
    public abstract void transact();

    private void takeNumber() {
        System.out.println("取号排队");
    }

}

class DrawMoney extends BankTemplateMethod{

    @Override
    public void transact() {
        System.out.println("我要取款！！");
    }
}