package com.arksh.ch3.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2016/10/17 0017.
 */
@Service
public class ScheduleTaskService {

    public static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("fixRated:时间5秒一次：" + simpleDateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 * * * * ?")
    public void fixTimeExec(){
        System.out.println("指定时间运行："+ simpleDateFormat.format(new Date()));
    }
}
