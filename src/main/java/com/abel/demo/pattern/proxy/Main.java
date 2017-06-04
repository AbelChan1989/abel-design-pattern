package com.abel.demo.pattern.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by abel.chan on 17/6/4.
 */
public class Main {
    public static void main(String[] args) {

        Entity entity = new EntityImpl("EntityImpl");

        MyInvocationHandler invocationHandler = new MyInvocationHandler(entity);

        Entity entityImp = (Entity) Proxy.newProxyInstance(
                entity.getClass().getClassLoader(),
                entity.getClass().getInterfaces(),
                invocationHandler);

        System.out.println(entityImp.getClass());
        System.out.println(entityImp.getName());
        entityImp.print();


    }
}
