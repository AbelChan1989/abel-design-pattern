package com.abel.demo.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by abel.chan on 17/6/4.
 */
public class MyInvocationHandler implements InvocationHandler {
    Entity entity;

    public MyInvocationHandler(Entity entity) {
        this.entity = entity;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(entity, args);
    }
}
