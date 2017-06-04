package com.abel.demo.pattern.adapter;

/**
 * Created by abel.chan on 17/6/4.
 */
public class Adaptee {

    public void hasMore() {
        System.out.println(this.getClass().getSimpleName() + ":" + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    public void nextElement() {
        System.out.println(this.getClass().getSimpleName() + ":" + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    public void removeElement() {
        System.out.println(this.getClass().getSimpleName() + ":" + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

}
