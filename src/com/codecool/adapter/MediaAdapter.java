package com.codecool.adapter;

public class MediaAdapter implements MediaPlayer {
    AdvancedMP4Player advancedMP4Player;
    AdvancedVLCPlayer advancedVLCPlayer;

    public MediaAdapter(String audioType){

        if(audioType.equalsIgnoreCase("vlc") ){
            advancedVLCPlayer = new AdvancedVLCPlayer();

        }else if (audioType.equalsIgnoreCase("mp4")){
            advancedMP4Player = new AdvancedMP4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase("vlc")){
            advancedVLCPlayer.play(fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            advancedMP4Player.play(fileName);
        }
    }
}
