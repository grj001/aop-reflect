package com.grj.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;



/**
 * ����:
 * ��Integer��List�з���һ��String
 *
 */
public class IStrIList {

	public static void main(String[] args) throws Exception {
		 ArrayList<Integer> list = new ArrayList<Integer>();
         Method method = list.getClass().getMethod("add", Object.class);
         method.invoke(list, "����String");
         System.out.println(list.get(0));
	}
}
