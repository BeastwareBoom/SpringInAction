package com.ascland.chapter03.externals;


import org.springframework.beans.factory.annotation.Value;

public class BlankDisc {

    private String title;
    private String artist;

//    public BlankDisc(@Value("${disc.title}") String title,
//                     @Value("${disc.artist}") String artist) {
//        this.title = title;
//        this.artist = artist;
//    }

//    public BlankDisc(@Value("#{systemProperties['disc.title']}") String title,
//                     @Value("#{systemProperties['disc.artist']}") String artist) {
//        this.title = title;
//        this.artist = artist;
//    }

    public BlankDisc(String title,
                      String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

}
