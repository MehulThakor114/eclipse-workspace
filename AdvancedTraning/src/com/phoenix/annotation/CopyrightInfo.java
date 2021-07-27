package com.phoenix.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.FIELD})
public @interface CopyrightInfo {
     String author();
     double version() default  1.0;
     String copyright() default  "STL";
}
