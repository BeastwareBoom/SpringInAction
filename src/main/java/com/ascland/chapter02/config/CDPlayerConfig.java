package com.ascland.chapter02.config;
import com.ascland.chapter02.Marker;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan
//@ComponentScan("com.ascland.chapter02")
//传入包名
//@ComponentScan(basePackages = "com.ascland.chapter02")
//字符串形式的多个包名
//@ComponentScan(basePackages = {"com.ascland.chapter02","com.ascland.chapter01"})
//设置多个组件类
//@ComponentScan(basePackageClasses = {CDPlayer.class,SgtPeppers.class})
@ComponentScan(basePackageClasses = {Marker.class})
public class CDPlayerConfig {
}
