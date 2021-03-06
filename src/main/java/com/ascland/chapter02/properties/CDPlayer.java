package com.ascland.chapter02.properties;
import com.ascland.chapter02.CompactDisc;
import com.ascland.chapter02.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;



public class CDPlayer implements MediaPlayer {
  private CompactDisc compactDisc;

  @Autowired
  public void setCompactDisc(CompactDisc compactDisc) {
    this.compactDisc = compactDisc;
  }

  public void play() {
    compactDisc.play();
  }

}
