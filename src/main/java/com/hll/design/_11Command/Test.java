package com.hll.design._11Command;

/**
 * @author linglong.he
 * @date 2020-09-03 10:40
 **/
public class Test {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command c = new MyCommond(receiver);
        Invoke i = new Invoke(c);
        i.action();
    }
}
