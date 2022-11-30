package com.xzy.chainofresponsibility.com.xzy.chainofresp;

/**
 * Created by xzy on 18/8/6  .
 */

// 链表方式定义责任链
public abstract class Leader {

    protected String name; // 领导名字

    protected Leader nextLeader;  // 下一个领导

    public Leader(String name) {
        this.name = name;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    public abstract void handleRequest(LeaveRequest request);
}
