package com.arksh.ch1.cj;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2016/10/13 0013.
 */
public class AppMain1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService1 useFunctionService1 = context.getBean(UseFunctionService1.class);
        System.out.print(useFunctionService1.sayHello("Java Config!"));
        context.close();
    }
}
