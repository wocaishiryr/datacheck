package com.github.wocaishiryr.annotation;

import java.lang.annotation.*;

@Documented
@Inherited
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DataCheck {

    /** 必填 */
    boolean required() default true;

    int minLength() default 0;

    int maxLength() default 100;

    /** 类型 */
    String type();


}
