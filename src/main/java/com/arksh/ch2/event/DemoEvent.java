package com.arksh.ch2.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by Administrator on 2016/10/13 0013.
 */
public class DemoEvent extends ApplicationEvent{
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

}
