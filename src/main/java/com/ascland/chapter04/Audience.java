package com.ascland.chapter04;

import org.aspectj.lang.annotation.*;

/**
 * Created by Asus on 2017/11/15.
 */
@Aspect
public class Audience {

    //定义命名的切点
    @Pointcut("execution(* com.ascland.chapter04.Performance.perform(..))")
    public void perform() {

    }

    @Before("perform()")
    public void silencingCellPhones() {
        System.out.println("Silence all cell phones.");
    }

    @AfterReturning("perform()")
    public void applause() {
        System.out.println("Clap clap clap!");
    }

    @AfterThrowing("perform()")
    public void demandRefund() {
        System.out.println("Demand a refund.");
    }
}
