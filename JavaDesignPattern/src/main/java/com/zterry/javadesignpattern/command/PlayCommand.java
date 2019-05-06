package com.zterry.javadesignpattern.command;

public class PlayCommand extends Command {
    @Override
    void execute() {
        audioPlayer.play();
    }
}
