package com.abel.demo.pattern.observer;

import java.util.ArrayList;

/**
 * Created by abel.chan on 17/6/4.
 */
public class RealSubject implements Subject {

    ArrayList<Observer> observers = new ArrayList<Observer>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(String.valueOf(System.currentTimeMillis()));
        }
    }
}
