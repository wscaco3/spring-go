package com.arksh.ch1.cj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2016/10/13 0013.
 */
@Configuration
public class JavaConfig {

    @Bean
    public FunctionService1 functionService(){
        return new FunctionService1();
    }

    @Bean
    public UseFunctionService1 useFunctionService(FunctionService1 functionService1){
        UseFunctionService1 useFunctionService1 = new UseFunctionService1();
        useFunctionService1.setFunctionService1(functionService1);
        return useFunctionService1;
    }


}
