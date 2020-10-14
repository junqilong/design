package com.hll.design._03factory.abstractmethod;

/**
 * @author linglong.he
 * @date 2020-08-25 15:05
 **/
public class OldFactory extends AbstractFactory {
    Food createFood() {
        return new Tomota();
    }

    Moveable createMoveable() {
        return new Plane();
    }
}
