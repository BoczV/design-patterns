package com.codecool.adapter;

public class AdvancedVLCPlayer implements AdvancedMediaPlayer{

    @Override
    public void play(String fileName) {
        playVlc(fileName);
    }

    private void playVlc(String fileName){
        System.out.println("Playing vlc file. Name: "+ fileName);
    };
}
