package com.xzy.memento;

/**
 * Created by xzy on 18/8/18  .
 */

public class Emp {
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

    public Emp(String name, Long age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // 备忘
    public EmpMemento memento(){
        return new EmpMemento(this);
    }

    // 数据恢复
    public void recoverery(EmpMemento empMemento){
        this.name = empMemento.getName();
        this.age = empMemento.getAge();
        this.salary = empMemento.getSalary();
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }


}
