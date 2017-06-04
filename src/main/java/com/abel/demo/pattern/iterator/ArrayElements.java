package com.abel.demo.pattern.iterator;

import java.util.Iterator;

/**
 * Created by abel.chan on 17/6/4.
 */
public class ArrayElements {
    Element[] values;
    int max = 10;
    int index = 0;

    public ArrayElements() {
        this.values = new Element[10];
    }

    public void add(Element element) {
        if (index >= max) {
            throw new IndexOutOfBoundsException(index + "");
        }
        values[index++] = element;
    }

    public Iterator createIterator() {
        return new ArrayIterator(values, index);
    }

}
