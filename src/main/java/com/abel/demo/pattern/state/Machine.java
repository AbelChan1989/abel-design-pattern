package com.abel.demo.pattern.state;

/**
 * Created by abel.chan on 17/6/4.
 */
public class Machine {

    State stateA;
    State stateB;
    State stateC;

    State current = stateA;

    public Machine() {
        stateA = new StateA(this);
        stateB = new StateB(this);
        stateC = new StateC(this);
    }

    public void next() {
        current.next();
    }

    public void prior() {
        current.prior();
    }

    public void setState(State state) {
        this.current = state;
    }

    public State getStateA() {
        return stateA;
    }

    public void setStateA(State stateA) {
        this.stateA = stateA;
    }

    public State getStateB() {
        return stateB;
    }

    public void setStateB(State stateB) {
        this.stateB = stateB;
    }

    public State getStateC() {
        return stateC;
    }

    public void setStateC(State stateC) {
        this.stateC = stateC;
    }
}
