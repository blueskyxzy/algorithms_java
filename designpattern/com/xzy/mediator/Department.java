package com.xzy.mediator;

public interface Department {

    void selfAction(); //做本部门的事情

    void outAction(); //向上级如总经理申请
}
