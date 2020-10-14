package com.hll.design._05facade;

/**
 * Created by linglong.he on 2020/8/27.
 */
public interface Light {

    void on();
    void off();
}

class MyLight implements  Light{

    public void on() {
        System.out.println("开灯");
    }

    public void off() {
        System.out.println("关灯");
    }
}
