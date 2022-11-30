package com.xzy.template;

/**
 * Created by xzy on 18/8/16  .
 */

public class Client {
    public static void main(String[] args){
        BankTemplateMethod templateMethod = new DrawMoney();
        templateMethod.process();

        // 用匿名内部类实现
        BankTemplateMethod template = new BankTemplateMethod() {
            @Override
            public void transact() {
                System.out.println("我要存钱");
            }
        };
        template.process();
    }
}
