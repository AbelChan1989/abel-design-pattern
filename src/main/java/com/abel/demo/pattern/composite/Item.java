package com.abel.demo.pattern.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by abel.chan on 17/6/4.
 */
public class Item extends Component {
    List<Component> componentList;
    String name;

    public Item(String name) {
        componentList = new ArrayList<Component>();
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void add(Component component) {
        componentList.add(component);
    }

    @Override
    public void remove(Component component) {
        componentList.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return componentList.get(i);
    }

    @Override
    public void print() {
        System.out.println(this.getClass().getSimpleName() + ":" + name);
        Iterator<Component> iterator = componentList.iterator();
        while (iterator.hasNext()) {
            Component component = iterator.next();
            component.print();
        }
    }
}
