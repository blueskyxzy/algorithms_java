package com.xzy.chainofresponsibility.com.xzy.chainofresp;

/**
 * Created by xzy on 18/8/7  .
 */

public class Client {
    public static void main(String[] args){
        Leader a = new Director("主任1");
        Leader b = new Manager("经理1");
        Leader c = new GeneralManager("总经理1");

        a.setNextLeader(b);
        b.setNextLeader(c);

        LeaveRequest request = new LeaveRequest("员工1","去美国老家",5);
        a.handleRequest(request);
    }
}
