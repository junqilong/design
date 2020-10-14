package com.hll.design._02strategy;

/**
 * @author linglong.he
 * @date 2020-08-25 13:58
 **/
public class Test {


    public static void main(String[] args) {
        ParentDo parentDo = new ParentDo();
//        parentDo.setChildBetterStrategy(new ReadStrategy());
        parentDo.setChildBetterStrategy(new SportsStrategy());
        parentDo.parentdo();

    }
}
