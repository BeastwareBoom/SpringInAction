package com.ascland.chapter03.externals;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:properties/externals.properties")
public class EnvironmentPropertiesAnnotationConfig {

    /*
    @Value("${disc.title}")
    private String title;
    @Value("${disc.artist}")
    private String artist;
*/

    /**/
    @Value("#{configProperties['disc.title']}")
    private String title;

    @Value("#{configProperties['disc.artist']}")
    private String artist;


    @Bean
    public BlankDisc blankDisc() {
        return new BlankDisc(title, artist);
    }


    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholder() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
