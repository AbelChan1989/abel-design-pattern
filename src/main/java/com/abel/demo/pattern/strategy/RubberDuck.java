package com.abel.demo.pattern.strategy;

/**
 * Created by abel.chan on 17/6/4.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        super();
    }

    @Override
    public void initQuackBehavior() {
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void initFlyBehavior() {
        quackBehavior = new Squack();
    }
}
