package com.arksh.ch2.initdestory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Administrator on 2016/10/13 0013.
 */
public class Jsr250WayService {

    @PostConstruct
    public void init(){
        System.out.println("JSR250方式初始化");
    }

    @PreDestroy
    public void destory(){
        System.out.println("JSR250方式销毁");
    }

    public Jsr250WayService() {
        super();
        System.out.println("初始化构造函数--Jsr250WayService");
    }
}
