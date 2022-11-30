package com.xzy.chainofresponsibility.com.xzy.chainofresp;

/**
 * Created by xzy on 18/8/6  .
 */

// 经理
public class GeneralManager extends Leader{

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays()<30){
            System.out.println(request.getName()+"请假天数"+request.getLeaveDays());
            System.out.println("总经理"+name+"审批通过");
        } else {
            System.out.println(request.getName()+"想辞职");
        }
    }
}
