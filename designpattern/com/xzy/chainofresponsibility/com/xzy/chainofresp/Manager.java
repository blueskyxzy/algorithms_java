package com.xzy.chainofresponsibility.com.xzy.chainofresp;

/**
 * Created by xzy on 18/8/6  .
 */

// 经理
public class Manager extends Leader{

    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays()<10){
            System.out.println(request.getName()+"请假天数"+request.getLeaveDays());
            System.out.println("经理"+name+"审批通过");
        } else {
            if (nextLeader!=null){
                nextLeader.handleRequest(request);
            }
        }
    }
}
