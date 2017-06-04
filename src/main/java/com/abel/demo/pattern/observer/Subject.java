package com.abel.demo.pattern.observer;

/**
 * Created by abel.chan on 17/6/4.
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
