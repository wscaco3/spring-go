package com.arksh.ch2.initdestory;

/**
 * Created by Administrator on 2016/10/13 0013.
 */
public class BeanWayService {
    public void init(){
        System.out.println("Bean方式初始化");
    }
    public void destory(){
        System.out.println("Bean方式销毁");
    }

    public BeanWayService() {
        super();
        System.out.println("初始化构造函数--BeanWayService");
    }
}
