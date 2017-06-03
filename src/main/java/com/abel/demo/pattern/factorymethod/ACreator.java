package com.abel.demo.pattern.factorymethod;

/**
 * Created by abel.chan on 17/6/3.
 */
public abstract class ACreator {

    public void print(String type) throws Exception {
        creator(type).print();
    }

    public abstract IProduct creator(String type) throws Exception;
}
