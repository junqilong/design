package com.hll.design._05facade;

/**
 * Created by linglong.he on 2020/8/27.
 */
public interface TV {
    void on();
    void off();

}

class MyTv implements  TV{

    public void on() {
        System.out.println("打开电视");
    }

    public void off() {
        System.out.println("关闭电视");
    }
}
