package com.ascland.chapter04.args;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;

/**
 * Created by Asus on 2017/11/15.
 */
@Configuration
@EnableAspectJAutoProxy//启用AspectJ自动代理
public class TrackConfig {

    @Bean
    public CompactDisc compactDisc() {
        CompactDisc compactDisc = new CompactDisc();
        ArrayList<String> tracks = new ArrayList<String>();
        tracks.add("Listen to the Rhythm of the falling rain");
        tracks.add("Take me to your heart");
        tracks.add("My love");
        compactDisc.setTracks(tracks);
        return compactDisc;
    }

    @Bean
    public TrackCounter trackCounter() {
        return new TrackCounter();
    }
}
