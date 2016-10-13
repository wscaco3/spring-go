package com.arksh.ch1.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/10/13 0013.
 */
@Service
public class UseFunctionService {
    @Autowired
    private FunctionService functionService;

    public String sayHello(String world){
        return functionService.helloString(world);
    }
}
