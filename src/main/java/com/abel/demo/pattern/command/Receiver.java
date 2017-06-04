package com.abel.demo.pattern.command;

/**
 * Created by abel.chan on 17/6/4.
 */
public class Receiver {
    Command[] exCommands;
    Command[] offCommands;

    public Receiver() {
        exCommands = new Command[2];
        offCommands = new Command[2];
        Command nullCommand = new NullCommand();
        for (int i = 0; i < exCommands.length; i++) {
            exCommands[i] = nullCommand;
            offCommands[i] = nullCommand;
        }
    }

    public void SetCommand(int slot, Command exCommand, Command unCommand) throws Exception {
        if (slot >= this.exCommands.length) {
            throw new IndexOutOfBoundsException(slot + "");
        }
        this.exCommands[slot] = exCommand;
        this.offCommands[slot] = unCommand;
    }

    public void exCommandPush(int slot) {
        this.exCommands[slot].execute();
    }

    public void exCommandUndo(int slot) {
        this.exCommands[slot].undo();
    }

    public void offCommandPush(int slot) {
        this.offCommands[slot].execute();
    }

    public void offCommandUndo(int slot) {
        this.offCommands[slot].undo();
    }
}
