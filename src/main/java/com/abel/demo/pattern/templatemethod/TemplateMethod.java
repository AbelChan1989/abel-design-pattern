package com.abel.demo.pattern.templatemethod;

/**
 * Created by abel.chan on 17/6/4.
 */
public abstract class TemplateMethod {
    public void execute() {
        System.out.println("execute step1");
        step1();
        System.out.println("execute step2");
        step2();
        System.out.println("execute step3");
        step3();
    }

    public abstract void step1();

    public abstract void step2();

    public void step3() {
        System.out.println(this.getClass().getSimpleName() + ":" + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

}
