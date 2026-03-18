package com.oop.exer1;

public class PersonTest {
    public static void main(String[] args) {
        //创建类的对象,类和对象的创建要在同一个包下
        Person p1 = new Person();
        //给对象的属性赋值
        p1.name = "张三";
        p1.age = 21;
        p1.gender = '男';
        System.out.println(p1.name + " " + p1.age + " " + p1.gender);
        //调用对象的方法
        p1.eat();
        p1.sleep(8);
        p1.wc();
        //创建第二个对象
        Person p2 = new Person();
        p2.name = "李四";
        p2.age = 22;
        p2.gender = '女';
        System.out.println(p2.name + " " + p2.age + " " + p2.gender);
        p2.eat();
        p2.sleep(9);
        p2.wc();

        //面向对象的内存解析
/*  new出来的对象存储在堆内存中
    栈中开辟空间存储main 方法，存储main方法中的变量
    变量存储在栈内存中对象名，对象名对应的是堆内存中的对象首地址
    堆中存储对象的属性和方法*/


    }
}
