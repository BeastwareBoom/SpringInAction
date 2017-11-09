package com.ascland.chapter02.config;
import com.ascland.chapter02.CDPlayer;
import com.ascland.chapter02.CompactDisc;
import com.ascland.chapter02.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 使用@Bean创建bean
 */
@Configuration
public class CDPlayerConfig2 {
  
//  @Bean
//  public CompactDisc compactDisc() {
//    return new SgtPeppers();
//  }

  @Bean
  public CompactDisc sgtPeppers() {
    return new SgtPeppers();
  }

//  @Bean
//  public CDPlayer cdPlayer() {
//    return new CDPlayer(sgtPeppers());
//  }
//
//  @Bean
//  public CDPlayer anotherCDPlayer() {
//    return new CDPlayer(sgtPeppers());
//  }

  //最佳方式
  @Bean
  public CDPlayer cdPlayer(CompactDisc compactDisc) {
    return new CDPlayer(compactDisc);
  }

//  通过setter方法注入
//  @Bean
//  public CDPlayer cdPlayer(CompactDisc compactDisc) {
//    CDPlayer cdPlayer = new CDPlayer(compactDisc);
//    cdPlayer.setCompactDisc(compactDisc);
//    return cdPlayer;
//  }

}
