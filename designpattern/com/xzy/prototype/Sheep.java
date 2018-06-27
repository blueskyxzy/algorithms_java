package com.xzy.prototype;

import java.util.Date;

/**
 * Created by xzy on 18/6/26  .
 */

public class Sheep implements Cloneable{

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    private String sname;

    private Date birthday;

    public Sheep(String sname, Date birthday) {
        this.sname = sname;
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
          return super.clone();
//        Object obj = super.clone();   // 深复制 或者通过序列化和反序列化完成
//        Sheep s =(Sheep) obj;
//        s.birthday = (Date) this.birthday.clone();
//        return obj;
    }
}
