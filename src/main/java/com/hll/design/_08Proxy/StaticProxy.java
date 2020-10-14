package com.hll.design._08Proxy;

import java.util.Random;

/**
 * @author linglong.he
 * @date 2020-08-31 10:44
 **/
public class StaticProxy {

    public static void main(String[] args) {
        MyAction myAction = new MyBusinessAction();
        new LogProxy(new TimeProxy(myAction)).doAction();
    }

}


//被代理对象实现的真正方法
interface MyAction{
    void doAction();
}

class MyBusinessAction implements MyAction{

    public void doAction() {
        System.out.println("真正业务方法被执行！");
    }
}

/**
 * 记录日志代理类
 */
class LogProxy implements MyAction{
    MyAction myAction;

    public LogProxy(MyAction myAction){
        this.myAction = myAction;
    }

    public void doAction() {
        System.out.println("开始记录日志了！");
        myAction.doAction();
        System.out.println("记录日志结束了！");
    }
}

class TimeProxy implements MyAction{
    MyAction myAction;

    public TimeProxy(MyAction myAction){
        this.myAction = myAction;
    }

    public void doAction() {
        System.out.println("开始记录时间了！");
        myAction.doAction();
        System.out.println("记录时间结束了，总共耗时："+new Random().nextInt(1000));
    }
}
