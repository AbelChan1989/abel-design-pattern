package com.abel.demo.pattern.singleton;

/**
 * Created by abel.chan on 17/6/4.
 */
public class Main {
    public static void main(String[] args) {

        {
            SingletonA singleton1 = SingletonA.getInstance();
            SingletonA singleton2 = SingletonA.getInstance();

            System.out.println(singleton1 == singleton2);
        }

        {
            SingletonB singleton1 = SingletonB.singletonB;
            SingletonB singleton2 = SingletonB.singletonB;

            System.out.println(singleton1 == singleton2);
        }
    }
}
