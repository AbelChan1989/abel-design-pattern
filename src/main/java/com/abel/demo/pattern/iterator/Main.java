package com.abel.demo.pattern.iterator;

import java.util.Iterator;

/**
 * Created by abel.chan on 17/6/4.
 */
public class Main {
    public static void main(String[] args) {

        Element elementA = new Element("name1", 1);
        Element elementB = new Element("name2", 2);

        ListElements listElements = new ListElements();
        listElements.add(elementA);
        listElements.add(elementB);

        Element elementC = new Element("name3", 3);
        Element elementD = new Element("name4", 4);
        ArrayElements arrayElements = new ArrayElements();
        arrayElements.add(elementC);
        arrayElements.add(elementD);

        Iterator iteratorA = listElements.createIterator();
        while (iteratorA.hasNext()) {
            System.out.println(iteratorA.next());
        }

        Iterator iteratorB = arrayElements.createIterator();
        while (iteratorB.hasNext()) {
            System.out.println(iteratorB.next());
        }

    }
}
