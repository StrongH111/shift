package com.oop.exer1;

public class Person {
    //类的定义：即定义类的属性和方法

    //定义属性(成员变量)
    String name;
    int age;
    char gender;

    //定义方法(成员方法)
    public void eat(){
        System.out.println("人要吃饭");
    }
    public void sleep(int hours){
        System.out.println("人要睡觉" + hours + "小时");
    }
    public void wc(){
        System.out.println("人要上厕所");
    }
}
