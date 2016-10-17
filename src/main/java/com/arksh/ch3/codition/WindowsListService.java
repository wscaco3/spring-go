package com.arksh.ch3.codition;

/**
 * Created by Administrator on 2016/10/17 0017.
 */
public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
