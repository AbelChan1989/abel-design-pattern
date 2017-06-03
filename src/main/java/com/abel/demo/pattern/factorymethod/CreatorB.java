package com.abel.demo.pattern.factorymethod;

/**
 * Created by abel.chan on 17/6/3.
 */
public class CreatorB extends ACreator {

    @Override
    public IProduct creator(String type) {
        if (type.equalsIgnoreCase("B-A")) {
            return new ProductA();
        } else if (type.equalsIgnoreCase("B-B")) {
            return new ProductB();
        }
        throw new IllegalArgumentException("type不正确!type:" + type);
    }
}
