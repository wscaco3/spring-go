package com.arksh.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Administrator on 2016/10/13 0013.
 */
@Configuration
@ComponentScan("com.arksh.ch1.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
