package com.study.java.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface TestAnnotation {

    String value() default "test";//value比较特殊,可以不指定value=""

    String id();//使用时需要指定id=""
}
