package com.abel.demo.pattern.command;

/**
 * Created by abel.chan on 17/6/4.
 */
public interface Command {
    void execute();

    void undo();
}
