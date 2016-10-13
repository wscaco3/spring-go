package com.arksh.ch3.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2016/10/13 0013.
 */
public class AppMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Config.class);
        context.refresh();
        AwareService awareService = context.getBean(AwareService.class);
        awareService.output();
        context.close();
    }
}
