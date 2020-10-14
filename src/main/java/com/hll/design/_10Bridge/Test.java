package com.hll.design._10Bridge;

/**
 * @author linglong.he
 * @date 2020-09-03 10:04
 **/
public class Test {

    public static void main(String[] args) {
        Gift gift = new WarmGift(new Flower());
        gift.impl.sayName();
    }
}
