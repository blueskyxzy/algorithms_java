package com.xzy.state;


/**
 * Created by xzy on 18/8/15  .
 */

public class Client {

    public static void main(String[] args){
        Context context = new Context();
        context.setState(new FreeState());

        context.setState(new BookedState());
    }

}
