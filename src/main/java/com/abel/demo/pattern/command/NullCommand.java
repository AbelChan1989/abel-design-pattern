package com.abel.demo.pattern.command;

/**
 * Created by abel.chan on 17/6/4.
 */
public class NullCommand implements Command {
    @Override
    public void execute() {
        System.out.println(this.getClass().getSimpleName() + ":" + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Override
    public void undo() {
        System.out.println(this.getClass().getSimpleName() + ":" + Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}
