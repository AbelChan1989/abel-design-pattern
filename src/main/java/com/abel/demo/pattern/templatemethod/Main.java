package com.abel.demo.pattern.templatemethod;

/**
 * Created by abel.chan on 17/6/4.
 */
public class Main {
    public static void main(String[] args) {
        TemplateMethod method1 = new ConceteA();
        method1.execute();

        TemplateMethod method2 = new ConceteB();
        method2.execute();
    }
}
