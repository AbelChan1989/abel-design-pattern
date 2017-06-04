package com.abel.demo.pattern.strategy;

/**
 * Created by abel.chan on 17/6/4.
 */
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("wing wing wing!");
    }
}
