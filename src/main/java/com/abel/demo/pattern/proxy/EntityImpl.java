package com.abel.demo.pattern.proxy;

/**
 * Created by abel.chan on 17/6/4.
 */
public class EntityImpl implements Entity {
    String name;

    public EntityImpl(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println(this.getClass().getSimpleName() + ":::" + name);
    }
}
