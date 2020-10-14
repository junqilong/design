package com.hll.design._03factory.factorymethod;

/**
 * @author linglong.he
 * @date 2020-08-25 14:48
 **/
public class Test {


    public static void main(String[] args) {
        /*Car car = new Car();
        car.go();*/

//        Moveable moveable = new PlaneFactory().create();
        Moveable moveable = new CarFactory().create();
        moveable.go();
    }
}
