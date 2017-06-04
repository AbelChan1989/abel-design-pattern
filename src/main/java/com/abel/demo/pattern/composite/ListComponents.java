package com.abel.demo.pattern.composite;

/**
 * Created by abel.chan on 17/6/4.
 */
public class ListComponents {
    Component values;

    public ListComponents(Component values) {
        this.values = values;
    }

    public void print() {
        values.print();
    }
}
