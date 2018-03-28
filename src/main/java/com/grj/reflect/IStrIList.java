package com.grj.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;



/**
 * 反射:
 * 在Integer的List中放置一个String
 *
 */
public class IStrIList {

	public static void main(String[] args) throws Exception {
		 ArrayList<Integer> list = new ArrayList<Integer>();
         Method method = list.getClass().getMethod("add", Object.class);
         method.invoke(list, "我是String");
         System.out.println(list.get(0));
	}
}
