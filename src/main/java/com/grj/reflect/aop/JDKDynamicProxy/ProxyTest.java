package com.grj.reflect.aop.JDKDynamicProxy;


public class ProxyTest {

    public static void main(String[] args) {
        //ʵ����InvocationHandler
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        //�����������
        Sky sky = (Sky) myInvocationHandler.getProxy(new SkyImpl());
        sky.rain();
    }

}