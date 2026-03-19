package com.oop.constructor;

public class TriAngleTest {
    public static void main(String[] args) {
       //调用构造器
        TriAngle t1 = new TriAngle(3,4);
        System.out.println(t1.getArea());
        //调用方法
        TriAngle t2 = new TriAngle();
        t2.setBase(3);
        t2.setHeight(4);
        System.out.println(t2.getArea());
        TriAngle t3 = new TriAngle();
        System.out.println(t3.getArea(3,4));
    }
}
