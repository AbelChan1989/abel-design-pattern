package com.abel.demo.pattern.iterator;

import java.util.Iterator;

/**
 * Created by abel.chan on 17/6/4.
 */
public class ArrayIterator implements Iterator<Element> {
    int postion;
    Element[] arrayElements;
    int length;

    public ArrayIterator(Element[] arrayElements, int length) {
        this.arrayElements = arrayElements;
        this.postion = 0;
        this.length = length;
    }

    @Override
    public boolean hasNext() {
        if (postion >= length) {
            return false;
        }
        return true;
    }

    @Override
    public Element next() {
        return arrayElements[postion++];
    }

    @Override
    public void remove() {
        if (!hasNext()) {
            return;
        }
        for (int i = postion + 1; i > length - 1; i++) {
            arrayElements[i - 1] = arrayElements[i];
        }
        arrayElements[length--] = null;
    }
}
