package com.hll.design._02strategy;

/**
 * @author linglong.he
 * @date 2020-08-25 13:51
 **/
public class ReadStrategy implements ChildBetterStrategy {

    public void parentShouldDo() {
        System.out.println("教孩子阅读！");
    }
}
