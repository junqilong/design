package com.hll.design._05facade;

/**
 * @author linglong.he
 * @date 2020-08-27 10:14
 **/
public class SmartFacade {

    private TV tv = new MyTv();
    private Light light = new MyLight();
    private Curtain curtain = new MyCurtain();

    public void on(){
        light.on();
        curtain.on();
        tv.on();
    }

    public void off(){
        tv.off();
        curtain.off();
        light.off();
    }

}
