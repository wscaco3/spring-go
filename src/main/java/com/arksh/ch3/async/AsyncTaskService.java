package com.arksh.ch3.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/10/13 0013.
 */
@Service
public class AsyncTaskService {
    @Async
    public void execAsyncTask(Integer i){
        System.out.println("执行异步任务：" + i);
    }

    @Async
    public void execAsyncTaskPlus(Integer i){
        System.out.println("执行异步任务+1：" + (i+1));
    }
}
