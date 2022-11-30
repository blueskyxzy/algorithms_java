package com.xzy.memento;

/**
 * Created by xzy on 18/8/15  .
 */

public class Client {

    public static void main(String[] args){
        CareTake careTake = new CareTake();

        Emp emp = new Emp("zhangsan", 27L, 8000.00);
        System.out.println(emp.toString());

        // 备忘记录
        careTake.setEmpMemento(emp.memento());

        emp.setAge(30L);
        emp.setSalary(30000D);
        System.out.println(emp.toString());

        // 恢复
        emp.recoverery(careTake.getEmpMemento());
        System.out.println(emp.toString());

    }

}
