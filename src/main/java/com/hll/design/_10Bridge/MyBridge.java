package com.hll.design._10Bridge;

/**
 * @author linglong.he
 * @date 2020-09-03 9:47
 **/
public class MyBridge {
}

abstract class Gift{
    GiftImpl impl;
}

class WarmGift extends Gift{
    public WarmGift(GiftImpl giftimpl){
        this.impl = giftimpl;
    }
}

class BeautyGift extends Gift{
    public BeautyGift(GiftImpl gift){
        this.impl = gift;
    }
}

abstract class GiftImpl{
    abstract void sayName();
}

class Flower extends GiftImpl{

    void sayName() {
        System.out.println("送花");
    }
}

class Gun extends GiftImpl{

    void sayName() {
        System.out.println("送枪");
    }
}
