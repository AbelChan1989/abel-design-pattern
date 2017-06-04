package com.abel.demo.pattern.state;

/**
 * Created by abel.chan on 17/6/4.
 */
public class StateB implements State {

    Machine machine;

    public StateB(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void next() {
        System.out.println(this.getClass().getSimpleName() + ":" + Thread.currentThread().getStackTrace()[1].getMethodName());
        machine.setState(machine.getStateC());
    }

    @Override
    public void prior() {
        System.out.println(this.getClass().getSimpleName() + ":" + Thread.currentThread().getStackTrace()[1].getMethodName());
        machine.setState(machine.getStateA());
    }
}
