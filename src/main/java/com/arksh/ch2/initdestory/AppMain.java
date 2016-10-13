package com.arksh.ch2.initdestory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2016/10/13 0013.
 */
public class AppMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        Jsr250WayService jsr250WayService = context.getBean(Jsr250WayService.class);
        context.close();
    }
}
