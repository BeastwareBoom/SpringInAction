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
  
  @Bean
  public CompactDisc compactDisc() {
    return new SgtPeppers();
  }
  
  @Bean
  public CDPlayer cdPlayer(CompactDisc compactDisc) {
    return new CDPlayer(compactDisc);
  }

}
