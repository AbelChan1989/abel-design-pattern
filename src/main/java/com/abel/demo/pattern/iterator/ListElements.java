package com.abel.demo.pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by abel.chan on 17/6/4.
 */
public class ListElements {
    List<Element> values;

    public ListElements() {
        this.values = new ArrayList<Element>();
    }

    public void add(Element element) {
        values.add(element);
    }

    public Iterator createIterator() {
        return values.iterator();
    }
}
