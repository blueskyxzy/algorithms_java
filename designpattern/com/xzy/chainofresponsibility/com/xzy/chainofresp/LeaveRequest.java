package com.xzy.chainofresponsibility.com.xzy.chainofresp;

/**
 * Created by xzy on 18/8/6  .
 */

// 请假类
public class LeaveRequest {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    private String name;

    public LeaveRequest(String name, String reason, int leaveDays) {
        this.name = name;
        this.reason = reason;
        this.leaveDays = leaveDays;
    }

    private String reason;

    private int leaveDays;
}
