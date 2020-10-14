package com.hll.design._03factory.abstractmethod;

/**
 * @author linglong.he
 * @date 2020-08-25 15:05
 **/
public class ModelFactory extends AbstractFactory {
    Food createFood() {
        return new Bread();
    }

    Moveable createMoveable() {
        return new Car();
    }
}
