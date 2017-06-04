package com.abel.demo.pattern.iterator;

/**
 * Created by abel.chan on 17/6/4.
 */
public class Element {
    private String name;
    private Integer value;

    public Element(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Element{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
