package com.hll.design._05facade;

/**
 * Created by linglong.he on 2020/8/27.
 */
public interface Curtain {

    void on();
    void off();
}

class MyCurtain implements Curtain{

    public void on() {
        System.out.println("打开窗帘");
    }

    public void off() {
        System.out.println("关闭窗帘");
    }
}
