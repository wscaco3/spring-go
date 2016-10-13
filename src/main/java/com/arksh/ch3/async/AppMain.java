package com.arksh.ch3.async;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2016/10/13 0013.
 */
public class AppMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Config.class);
        context.refresh();
        AsyncTaskService service = context.getBean(AsyncTaskService.class);

        for (int i = 0;i < 10;i++){
            service.execAsyncTask(i);
            service.execAsyncTaskPlus(i);
        }

        context.close();
    }
}
