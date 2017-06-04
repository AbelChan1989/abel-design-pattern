package com.abel.demo.pattern.adapter;

/**
 * Created by abel.chan on 17/6/4.
 */
public class Main {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();//原先的接口
        Target target = new Adapter(adaptee);//适配器
        target.hasNext();
        target.next();
        target.remove();
    }
}
