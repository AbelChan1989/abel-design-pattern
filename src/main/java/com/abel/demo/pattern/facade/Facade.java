package com.abel.demo.pattern.facade;

/**
 * Created by abel.chan on 17/6/4.
 */
public class Facade {
    private SubSystemA subSystemA;
    private SubSystemB subSystemB;

    public Facade() {
        this.subSystemA = new SubSystemA();
        this.subSystemB = new SubSystemB();
    }

    public void execute() {
        subSystemA.execute();
        subSystemB.execute();
    }


}
