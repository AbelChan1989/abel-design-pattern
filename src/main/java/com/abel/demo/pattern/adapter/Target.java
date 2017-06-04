package com.abel.demo.pattern.adapter;

/**
 * Created by abel.chan on 17/6/4.
 */
public class Target {
    public void hasNext(){
        System.out.println(this.getClass().getSimpleName() + ":" + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    public void next(){
        System.out.println(this.getClass().getSimpleName() + ":" + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    public void remove(){
        System.out.println(this.getClass().getSimpleName() + ":" + Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}
