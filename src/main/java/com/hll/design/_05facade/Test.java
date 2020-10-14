package com.hll.design._05facade;

/**
 * @author linglong.he
 * @date 2020-08-27 10:16
 **/
public class Test {

    public static void main(String[] args) {

        SmartFacade smartFacade = new SmartFacade();
        System.out.println("爷爷早上起来了：");
        smartFacade.on();
        System.out.println("爷爷晚上准备睡觉了：");
        smartFacade.off();
    }
}
