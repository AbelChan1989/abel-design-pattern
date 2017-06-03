package com.abel.demo.pattern.abstractfactory;

/**
 * Created by abel.chan on 17/6/3.
 */
public abstract class ACreator {

    public void printA(String type) throws Exception {
        creatorA(type).print();
    }

    public void printB(String type) throws Exception {
        creatorB(type).print();
    }

    public abstract IProductA creatorA(String type) throws Exception;

    public abstract IProductB creatorB(String type) throws Exception;
}
