package com.abel.demo.pattern.facade;

/**
 * Created by abel.chan on 17/6/4.
 */
public class SubSystemB {
    public void execute(){
        System.out.println(this.getClass().getSimpleName() + ":" + Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}
