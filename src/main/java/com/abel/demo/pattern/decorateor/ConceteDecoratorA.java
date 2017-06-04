package com.abel.demo.pattern.decorateor;

/**
 * Created by abel.chan on 17/6/4.
 */
public class ConceteDecoratorA extends Decorator {
    Component component;

    public ConceteDecoratorA(Component component) {
        this.component = component;
    }


    @Override
    public void methodA() {
        component.methodA();
        System.out.println(this.getClass().getSimpleName() + ":" + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Override
    public void methodB() {
        component.methodB();
        System.out.println(this.getClass().getSimpleName() + ":" + Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}
