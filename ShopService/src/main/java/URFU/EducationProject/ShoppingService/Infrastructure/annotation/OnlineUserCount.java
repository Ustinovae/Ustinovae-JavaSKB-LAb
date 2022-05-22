package URFU.EducationProject.ShoppingService.Infrastructure.annotation;

import java.lang.annotation.*;

@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface OnlineUserCount {
    String value() default "method.counted";

    boolean recordFailuresOnly() default false;

    String[] extraTags() default {};

    String description() default "";
}
