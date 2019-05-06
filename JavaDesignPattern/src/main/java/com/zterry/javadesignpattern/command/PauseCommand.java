package com.zterry.javadesignpattern.command;

public class PauseCommand extends Command {
    @Override
    void execute() {

        audioPlayer.pause();
    }
}
