package com.zterry.javadesignpattern.command;

public class StopCommand extends Command {
    @Override
    void execute() {
        audioPlayer.stop();
    }
}
