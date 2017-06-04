package com.abel.demo.pattern.templatemethod;

/**
 * Created by abel.chan on 17/6/4.
 */
public class ConceteB extends TemplateMethod{
    @Override
    public void step1() {
        System.out.println(this.getClass().getSimpleName() + ":" + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Override
    public void step2() {
        System.out.println(this.getClass().getSimpleName() + ":" + Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}
