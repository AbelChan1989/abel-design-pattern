package com.abel.demo.pattern.observer;

/**
 * Created by abel.chan on 17/6/4.
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new RealSubject();

        Observer observerA = new ObserverA(subject);
        Observer observerB = new ObserverB(subject);
        subject.notifyObservers();

        System.out.println("--------------remove observerB--------------");
        subject.removeObserver(observerB);
        subject.notifyObservers();
    }
}
