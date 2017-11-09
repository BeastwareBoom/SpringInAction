package com.ascland.chapter02.properties;

import com.ascland.chapter02.CompactDisc;

import java.util.List;


public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc(String title) {
        this.title = title;
    }

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("-Track: " + track);
        }
    }

}
