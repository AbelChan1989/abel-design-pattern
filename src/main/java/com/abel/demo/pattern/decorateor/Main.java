package com.abel.demo.pattern.decorateor;

/**
 * Created by abel.chan on 17/6/4.
 */
public class Main {
    public static void main(String[] args) {
        Component component = new ConceteComponentA();
        component = new ConceteDecoratorA(component);//装饰
        component = new ConceteDecoratorB(component);
        component.methodA();
        System.out.println("--------------");
        component.methodB();
    }
}
