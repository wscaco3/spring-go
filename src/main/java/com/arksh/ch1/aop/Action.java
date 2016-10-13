package com.arksh.ch1.aop;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2016/10/13 0013.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
