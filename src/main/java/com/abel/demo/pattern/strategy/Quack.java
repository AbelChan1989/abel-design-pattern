package com.abel.demo.pattern.strategy;

/**
 * Created by abel.chan on 17/6/4.
 */
public class Quack implements QuackBehavior{
    @Override
    public void quack() {

        System.out.println("quack quack quack");
    }
}
