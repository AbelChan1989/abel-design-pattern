package com.abel.demo.pattern.strategy;

/**
 * Created by abel.chan on 17/6/4.
 */
public class Squack implements QuackBehavior{
    @Override
    public void quack() {

        System.out.println("squack squack squack");
    }
}
