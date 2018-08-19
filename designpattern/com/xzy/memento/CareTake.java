package com.xzy.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by xzy on 18/8/18  .
 */

// 负责人类
public class CareTake {
    private EmpMemento empMemento;
    // 可以多个，用容器存
    // 可以序列化，持久化
    private Stack<EmpMemento> stack = new Stack<>();

    private List<EmpMemento> list = new ArrayList<>();

    public EmpMemento getEmpMemento() {
        return empMemento;
    }

    public void setEmpMemento(EmpMemento empMemento) {
        this.empMemento = empMemento;
    }
}
