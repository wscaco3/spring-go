package com.arksh.ch2.initdestory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2016/10/13 0013.
 */
@Configuration
public class Config {

    @Bean(initMethod = "init",destroyMethod = "destory")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }

    @Bean
    Jsr250WayService jsr250WayService(){
        return new Jsr250WayService();
    }

}
