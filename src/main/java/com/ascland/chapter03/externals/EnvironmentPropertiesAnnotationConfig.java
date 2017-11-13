package com.ascland.chapter03.externals;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

//参见https://stackoverflow.com/questions/13728000/value-not-resolved-when-using-propertysource-annotation-how-to-configure-prop
@Configuration
@PropertySource("classpath:properties/externals.properties")
public class EnvironmentPropertiesAnnotationConfig {

    /*${}方式取值*/
    @Value("${disc.title}")
    private String title;
    @Value("${disc.artist}")
    private String artist;


    @Bean
    public BlankDisc blankDisc() {
        return new BlankDisc(title, artist);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholder() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        configurer.setIgnoreUnresolvablePlaceholders(true);
        configurer.setIgnoreResourceNotFound(true);
        return configurer;
    }
}
