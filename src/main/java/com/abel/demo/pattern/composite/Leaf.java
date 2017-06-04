package com.abel.demo.pattern.composite;

/**
 * Created by abel.chan on 17/6/4.
 */
public class Leaf extends Component {
    String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println(this.getClass().getSimpleName() + ":" + name);
    }
}
