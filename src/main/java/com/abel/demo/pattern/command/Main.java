package com.abel.demo.pattern.command;

/**
 * Created by abel.chan on 17/6/4.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Command commandA = new ConceteCommandA();
            Command commandB = new ConceteCommandB();

            Receiver receiver = new Receiver();

            receiver.SetCommand(0, commandA, commandB);
            receiver.exCommandPush(0);
            receiver.exCommandUndo(0);

            receiver.offCommandPush(0);
            receiver.offCommandUndo(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
