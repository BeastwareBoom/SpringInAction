package com.ascland.chapter01.config;

import com.ascland.chapter01.BraveKnight;
import com.ascland.chapter01.Knight;
import com.ascland.chapter01.Quest;
import com.ascland.chapter01.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration注解相当于xml配置中的beans结点
 */
@Configuration
public class KnightConfig {

    /**
     * Bean注解相当于xml配置中的bean结点
     * 与Repository，Component，Service，Controller等注解不同，@Component 是用在类上，@Bean是在方法上
     *
     * 默认情况下，bean的ID与带有@Bean注解的方法名是一样的。在本例中，bean的名字将会是knight。
     * 如果你想为其设置成一个不同的名字的话，那么可以重命名该方法，也可以通过name属性指定一个不同名字。
     *
     * @return
     */
    @Bean(name = "knight")
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }

}
