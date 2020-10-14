package com.hll.design._13Adapter;

/**
 * @author linglong.he
 * @date 2020-09-03 11:09
 **/
public class MyAdapter {

    public static void main(String[] args) {
        new Adapter(new AmericaCt()).say();
    }
}

class AmericaCt{
    void say(){
        System.out.println("我是美国接头");
    }
}

class Adapter{
    AmericaCt americaCt;

    public Adapter(AmericaCt americaCt){
        this.americaCt = americaCt;
    }

    void say(){
        System.out.println("我是适配器,正在适配");
        americaCt.say();
        System.out.println("适配完成");
    }
}

