package com.arksh.ch1.cj;

/**
 * Created by Administrator on 2016/10/13 0013.
 */
public class UseFunctionService1 {

    FunctionService1 functionService1;

    public void setFunctionService1(FunctionService1 functionService1){
        this.functionService1 = functionService1;
    }

    public String sayHello(String world){
        return functionService1.sayHello(world);
    }
}
