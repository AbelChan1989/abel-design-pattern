package com.abel.demo.pattern.strategy;

/**
 * Created by abel.chan on 17/6/4.
 */
public class Main {
    public static void main(String[] args) {
        Duck duck1 = new MallardDuck();
        duck1.performFly();
        duck1.performQuack();

        Duck duck2 = new RubberDuck();
        duck2.performFly();
        duck2.performQuack();
    }
}
