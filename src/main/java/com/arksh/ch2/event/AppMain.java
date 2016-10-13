package com.arksh.ch2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2016/10/13 0013.
 */
public class AppMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Config.class);
        context.refresh();
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish("gogogo");
        context.close();
    }
}
