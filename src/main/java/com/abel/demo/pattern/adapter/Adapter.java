package com.abel.demo.pattern.adapter;

/**
 * Created by abel.chan on 17/6/4.
 */
public class Adapter extends Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void hasNext() {
        adaptee.hasMore();
    }

    @Override
    public void next() {
        adaptee.nextElement();
    }

    @Override
    public void remove() {
        adaptee.removeElement();
    }
}
