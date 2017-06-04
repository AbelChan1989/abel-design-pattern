package com.abel.demo.pattern.decorateor;

/**
 * Created by abel.chan on 17/6/4.
 */
public class ConceteComponentA implements Component {
    @Override
    public void methodA() {
        System.out.println(this.getClass().getSimpleName() + ":" + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Override
    public void methodB() {
        System.out.println(this.getClass().getSimpleName() + ":" + Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}
