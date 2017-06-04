package com.abel.demo.pattern.observer;

/**
 * Created by abel.chan on 17/6/4.
 */
public class ObserverB implements Observer {

    Subject subject;

    public ObserverB(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String value) {
        System.out.println(this.getClass().getSimpleName() + ":" + value);
    }
}
