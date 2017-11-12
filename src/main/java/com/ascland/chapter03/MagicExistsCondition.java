package com.ascland.chapter03;

        import org.springframework.context.annotation.Condition;
        import org.springframework.context.annotation.ConditionContext;
        import org.springframework.core.env.Environment;
        import org.springframework.core.type.AnnotatedTypeMetadata;

public class MagicExistsCondition implements Condition {

  public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
    Environment env = context.getEnvironment();
//    return env.containsProperty("magicBean");
    //Windows环境下的属性
//    return context.getEnvironment().getProperty("os.name").contains("Windows");
    return env.containsProperty("os.name");
  }

}
