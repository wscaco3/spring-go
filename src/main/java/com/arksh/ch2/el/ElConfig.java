package com.arksh.ch2.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * Created by Administrator on 2016/10/13 0013.
 */
@Configuration
@ComponentScan("com.arksh.ch2.el")
@PropertySource("classpath:test.properties")
public class ElConfig {

    @Value("a String value")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("#{ T(java.lang.Math).random() * 100.0 }")
    private double randomNumber;

    @Value("#{demoService.another}")
    private String fromAnotherService;

    @Value("classpath:test.txt")
    private Resource testFile;

    @Value("http://g.cn")
    private Resource testUrl;

    @Value("${book.author}")
    private String bookAuthor;

    @Autowired
    private Environment environment;

    @Bean
    public  static PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResouce(){
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnotherService);
            System.out.println(IOUtils.toString(testFile.getInputStream(),"utf-8"));
            System.out.println(IOUtils.toString(testUrl.getInputStream(),"utf-8"));
            System.out.println(bookAuthor);
            System.out.println(environment.getProperty("book.name"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
