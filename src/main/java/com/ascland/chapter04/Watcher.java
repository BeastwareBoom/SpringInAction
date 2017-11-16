package com.ascland.chapter04;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 创建环绕通知
 */
//@Aspect
public class Watcher {

    //定义命名的切点
    @Pointcut("execution(* com.ascland.chapter04.Performance.perform(..))")
    public void perform() {

    }

    @Around("perform()")
    public void watchPerformance(ProceedingJoinPoint point) {
        try {
            System.out.println("Silence all cell phones.");
            point.proceed();
            //可以多次调用proceed()方法，会多次执行perform()方法
            //point.proceed();
//            int i = 1/0;
            System.out.println("Clap clap clap!!!");
        } catch (Throwable e) {
            System.out.println("Demand a refund.");
        }
    }
}
