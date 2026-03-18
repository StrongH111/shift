package com.oop.exer2;

public class Animals {

    //成员变量(属性)，作用域是整个类，随着类的创建而创建，并随类的销毁而销毁，存储在堆中
    //有权限修饰符 public、private、proteted权限修饰符
    //有默认值，不赋值的话会有默认初始化值
    public String kind;
    private String name;//
    protected int age;

    //成员方法(行为)
    public void eat(){
        System.out.println(kind +"要吃饭");
    }



    //局部变量：方法内定义的变量，作用域是方法内，随着方法调用而创建，并随方法调用而销毁
    //随着方法进入栈内存，方法执行完毕后，出栈，销毁，
    //没有权限修饰符，没有默认值，不赋值会报错（方法已经有修饰符了，不能再添加权限修饰符）
    public void sleep(int hours){    //形参,是局部变量，只在方法中有效
        System.out.println( kind+"要睡觉"+hours+"小时");
    }
    public void play(){
        String   plays = "打滚";//局部变量，
        System.out.println(kind+"喜欢"+plays);

    }}
