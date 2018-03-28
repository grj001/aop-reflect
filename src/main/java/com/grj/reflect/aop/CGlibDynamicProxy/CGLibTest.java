package com.grj.reflect.aop.CGlibDynamicProxy;

public class CGLibTest {

    public static void main(String[] args) {
        MyCglib myCglib = new MyCglib();
        Color color = (Color) myCglib.getProxy(new Color());
        color.showColor();
    }
}
