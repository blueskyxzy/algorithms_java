package com.xzy.command;

/**
 * Created by xzy on 18/8/16  .
 */

// 调用者或发起者
public class Invoke {

    // 可以是命令容器，如list多条,如事务
    private Command command;

    public Invoke(Command command) {
        this.command = command;
    }

    public void call(){
        command.execute();
    }
}
