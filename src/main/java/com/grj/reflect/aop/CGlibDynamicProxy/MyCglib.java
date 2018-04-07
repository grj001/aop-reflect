package com.grj.reflect.aop.CGlibDynamicProxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MyCglib implements MethodInterceptor {

    //目标对象
    private Object obj = null;

    //创建一个子类,实现代理
    public Object getProxy(Object obj){
        this.obj = obj;
        Enhancer enhancer = new Enhancer();  
        enhancer.setSuperclass(obj.getClass());
        // 回调方法  
        enhancer.setCallback(this);  
        // 创建代理对象  
        return enhancer.create();

    }

    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("目标对象方法执行之前");
        Object result = methodProxy.invoke(obj, args);
        System.out.println("目标方法执行之后");
        return result;
    }

}