package com.grj.reflect.aop.JDKDynamicProxy;


public class ProxyTest {

    public static void main(String[] args) {
        //实例化InvocationHandler
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        //生产代理对象
        Sky sky = (Sky) myInvocationHandler.getProxy(new SkyImpl());
        sky.rain();
    }

}