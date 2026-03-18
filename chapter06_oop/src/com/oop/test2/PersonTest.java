package com.oop.test2;

import java.sql.SQLOutput;

public class PersonTest {
    public static void main(String[] args) {
        //创建Person对象
        Person p1 = new Person();
        //调用成员变量，设置该对象的name、age和gender属性
        p1.age = 21;
        //调用成员方法
        int age1 = p1.showAge();
        System.out.println("年龄为：" + age1);
        p1.addAge(2);
        System.out.println("年龄为：" + p1.showAge());

        //创建Person的第二个对象
        Person p2 = new Person();

        p2.addAge(10);
        System.out.println("年龄为：" + p2.showAge());//10


    }
}
