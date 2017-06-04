package com.abel.demo.pattern.singleton;

/**
 * Created by abel.chan on 17/6/4.
 */
public class SingletonA {

    private static SingletonA singletonA;

    public static SingletonA getInstance() {
        if (singletonA == null) {
            synchronized (SingletonA.class) {
                if (singletonA == null) {
                    singletonA = new SingletonA();
                }
            }
        }
        return singletonA;
    }
}
