package com.xzy.memento;

/**
 * Created by xzy on 18/8/18  .
 */

public class EmpMemento {

    private String name;
    private Long age;
    private Double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    // 拷贝
    public EmpMemento(Emp e) {
        this.name = e.getName();
        this.age = e.getAge();
        this.salary = e.getSalary();
    }

}
