package com.hll.design._02strategy;

/**
 * @author linglong.he
 * @date 2020-08-25 13:52
 **/
public class SportsStrategy implements ChildBetterStrategy {
    public void parentShouldDo() {
        System.out.println("教孩子运动");
    }
}
