package com.hll.design._08Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author linglong.he
 * @date 2020-08-31 10:55
 **/
public class DynamicProxy {

    public static void main(String[] args) {
        final MyAction myAction = new MyBusinessAction();
        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles","true");
        MyAction m = (MyAction)Proxy.newProxyInstance(MyAction.class.getClassLoader(), new Class[]{MyAction.class}, new MYInvocationHandler(myAction));
        m.doAction();
    }

}

class MYInvocationHandler implements InvocationHandler{
    MyAction myAction;
    public MYInvocationHandler(MyAction myAction){
        this.myAction = myAction;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理执行前。。。");
        Object invoke = method.invoke(myAction, args);
        System.out.println("动态代理执行后。。。。");
        return null;
    }
}


