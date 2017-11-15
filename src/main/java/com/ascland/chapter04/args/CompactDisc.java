package com.ascland.chapter04.args;

import java.util.List;

/**
 * Created by Asus on 2017/11/15.
 */
public class CompactDisc {

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
}
