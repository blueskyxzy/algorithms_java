package com.xzy.mediator;

/**
 * Created by xzy on 18/8/15  .
 */

public class Client {

    public static void main(String[] args){
        Mediator mediator = new President();
        Market market = new Market(mediator);
        Finacial finacial = new Finacial(mediator);
        Development development = new Development(mediator);

        market.selfAction();
        market.outAction();  //市场部需要财务交互，通过总经理来控制
    }

}
