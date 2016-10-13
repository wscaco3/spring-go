package com.arksh.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/10/13 0013.
 */
@Service
public class DemoMethodService {
    public void add(){
        System.out.println("Method add");
    }
}
