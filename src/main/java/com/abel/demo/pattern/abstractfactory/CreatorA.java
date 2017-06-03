package com.abel.demo.pattern.abstractfactory;


/**
 * Created by abel.chan on 17/6/3.
 */
public class CreatorA extends ACreator {

    @Override
    public IProductA creatorA(String type) {
        if (type.equalsIgnoreCase("A-A-1")) {
            return new ProductA1();
        } else if (type.equalsIgnoreCase("A-A-2")) {
            return new ProductA2();
        }
        throw new IllegalArgumentException("type不正确!type:" + type);
    }

    @Override
    public IProductB creatorB(String type) throws Exception {
        if (type.equalsIgnoreCase("A-B-1")) {
            return new ProductB1();
        } else if (type.equalsIgnoreCase("A-B-2")) {
            return new ProductB2();
        }
        throw new IllegalArgumentException("type不正确!type:" + type);

    }
}
