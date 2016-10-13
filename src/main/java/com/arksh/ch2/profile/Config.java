package com.arksh.ch2.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by Administrator on 2016/10/13 0013.
 */
@Configuration
public class Config {
    @Bean
    @Profile("dev")
    public DemoBean devDemobean(){
        return new DemoBean("开发环境的bean");
    }

    @Bean
    @Profile("prod")
    public DemoBean prodDemobean(){
        return new DemoBean("生产环境的bean");
    }
}
