package com.ascland.chapter04;

import com.ascland.chapter04.function.EncoreableIntroducer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Asus on 2017/11/15.
 */
@Configuration
@EnableAspectJAutoProxy//启用AspectJ自动代理
public class PerformanceConfig {
    @Bean
    public Performance piano() {
        return new Piano();
    }

    @Bean
    public Audience audience() {
        return new Audience();
    }

    @Bean
    public EncoreableIntroducer introducer(){
        return new EncoreableIntroducer();
    }
}
