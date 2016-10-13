package com.arksh.ch1.com;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/10/13 0013.
 */
@Service
public class FunctionService {
    public String helloString(String world){
        return "Hello " + world;
    }
}
