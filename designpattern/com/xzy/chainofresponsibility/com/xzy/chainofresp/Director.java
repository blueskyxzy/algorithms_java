package com.xzy.chainofresponsibility.com.xzy.chainofresp;

/**
 * Created by xzy on 18/8/6  .
 */

// 主任
public class Director extends Leader{

    public Director(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays()<3){
            System.out.println(request.getName()+"请假天数"+request.getLeaveDays());
            System.out.println("主任"+name+"审批通过");
        } else {
            if (nextLeader!=null){
                nextLeader.handleRequest(request);
            }
        }
    }
}
