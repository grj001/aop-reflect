package com.grj.reflect.aop.CGlibDynamicProxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MyCglib implements MethodInterceptor {

    //Ŀ�����
    private Object obj = null;

    //����һ������,ʵ�ִ���
    public Object getProxy(Object obj){
        this.obj = obj;
        Enhancer enhancer = new Enhancer();  
        enhancer.setSuperclass(obj.getClass());
        // �ص�����  
        enhancer.setCallback(this);  
        // �����������  
        return enhancer.create();

    }

    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("Ŀ����󷽷�ִ��֮ǰ");
        Object result = methodProxy.invoke(obj, args);
        System.out.println("Ŀ�귽��ִ��֮��");
        return result;
    }

}