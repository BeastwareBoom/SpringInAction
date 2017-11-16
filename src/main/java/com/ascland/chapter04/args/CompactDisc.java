package com.ascland.chapter04.args;

import java.util.List;

/**
 * Created by Asus on 2017/11/15.
 */
public class CompactDisc {

    private String title;
    private String name;
    private List<String> tracks;

    public void playTrack(int trackNumber) {
        System.out.println("CompactDisc " + trackNumber + " playing");
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
