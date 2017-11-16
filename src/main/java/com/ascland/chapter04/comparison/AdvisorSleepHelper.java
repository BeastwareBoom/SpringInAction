package com.ascland.chapter04.comparison;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * <aop:advisor>SleepHelper</aop:advisor>
 */
public class AdvisorSleepHelper implements MethodBeforeAdvice, AfterReturningAdvice {

    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("[advisor]起床后要洗脸");
    }

    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("[advisor]睡觉前要刷牙");
    }
}
