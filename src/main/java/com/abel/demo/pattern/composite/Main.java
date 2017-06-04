package com.abel.demo.pattern.composite;

/**
 * Created by abel.chan on 17/6/4.
 */
public class Main {
    public static void main(String[] args) {
        Component component1 = new Item("component1");
        Component component2 = new Item("component2");
        Component component3 = new Item("component3");
        Component component4 = new Item("component4");

        Component allComponent = new Item("all component");

        allComponent.add(component1);
        allComponent.add(component2);
        allComponent.add(component3);

        component3.add(component4);

        Component leaf1 = new Leaf("leaf1");
        Component leaf2 = new Leaf("leaf2");
        Component leaf3 = new Leaf("leaf3");
        Component leaf4 = new Leaf("leaf4");

        component1.add(leaf1);
        component2.add(leaf2);
        component3.add(leaf3);
        component4.add(leaf4);

        allComponent.print();

    }
}
