package com.grj.reflect.aop.JDKDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {
	// Ŀ�����
	private Object obj = null;

	// ��ȡĿ�����Ĵ������
	//JDKʵ�ֶ�̬������Ҫʵ����ͨ���ӿڶ���ҵ�񷽷�
	public Object getProxy(Object obj) {
		this.obj = obj;
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
	}


	// ����ִ��Ŀ�����ķ���
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Ŀ����󷽷�ִ��֮ǰ");
		Object result = method.invoke(obj, args);
		System.out.println("Ŀ����󷽷�ִ��֮��");
		return result;
	}
}
