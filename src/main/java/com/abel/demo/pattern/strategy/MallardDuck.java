package com.abel.demo.pattern.strategy;

/**
 * Created by abel.chan on 17/6/4.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        super();
    }

    @Override
    public void initQuackBehavior() {
        quackBehavior = new Quack();
    }

    @Override
    public void initFlyBehavior() {
        flyBehavior = new FlyWithWings();
    }
}
