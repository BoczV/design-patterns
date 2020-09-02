package com.codecool.adapter;

public class AdvancedMP4Player implements AdvancedMediaPlayer {

    @Override
    public void play(String fileName) {
        playMp4(fileName);
    }

    private void playMp4(String fileName){
        System.out.println("Playing mp4 file. Name: "+ fileName);
    };
}
