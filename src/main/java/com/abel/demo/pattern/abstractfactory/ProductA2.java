package com.abel.demo.pattern.abstractfactory;

import com.abel.demo.pattern.factorymethod.IProduct;

/**
 * Created by abel.chan on 17/6/3.
 */
public class ProductA2 implements IProductA {
    @Override
    public void print()
    {
        System.out.println(this.getClass().getSimpleName() + ":i am product a2");

    }
}
