package com.ascland.chapter04.function;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EncoreableIntroducer {

    @DeclareParents(value = "com.ascland.chapter04.Performance+",
            defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
