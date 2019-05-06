package com.zterry.javadesignpattern.command;

public abstract class Command {

    AudioPlayer audioPlayer;

    public AudioPlayer getAudioPlayer() {
        return audioPlayer;
    }

    public void setAudioPlayer(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    abstract void execute();
}
