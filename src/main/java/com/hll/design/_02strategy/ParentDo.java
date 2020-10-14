package com.hll.design._02strategy;

/**
 * @author linglong.he
 * @date 2020-08-25 13:55
 **/
public class ParentDo {

    private ChildBetterStrategy childBetterStrategy;

    /**
     * 设置策略
     * @param childBetterStrategy
     */
    public void setChildBetterStrategy(ChildBetterStrategy childBetterStrategy) {
        this.childBetterStrategy = childBetterStrategy;
    }

    public void parentdo(){
        childBetterStrategy.parentShouldDo();
    }

}
