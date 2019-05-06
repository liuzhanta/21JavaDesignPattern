package com.zterry.javadesignpattern.command;

public class Invoker {
    Command command;

    public Invoker(Command command) {
        this.command = command;
    }
    public void invoke(){
        command.execute();
    }
}
