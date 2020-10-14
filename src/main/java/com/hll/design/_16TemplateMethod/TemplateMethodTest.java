package com.hll.design._16TemplateMethod;

/**
 * @author linglong.he
 * @date 2020-09-04 10:31
 **/
public class TemplateMethodTest {

    public static void main(String[] args) {
        P p = new MyDo();
        p.dosome();
    }
}

abstract class P{
    public void dosome(){
        System.out.println("执行公共方法。。。。");
        do1();
        do2();
    }

    abstract void do1();
    abstract void do2();
}

class MyDo extends P{

    void do1() {
        System.out.println("执行do1方法");
    }

    void do2() {
        System.out.println("执行do2方法");
    }
}
