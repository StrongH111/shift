package com.oop.test1;

public class Employee {
    //声明一个Employee类型，包含属性:编号、姓名、年龄、薪资、生日(MyDate类型)
    int id;
    String name;
    int age;
    double salary;
    //类属性的类型分为两种：
    //1.基本数据类型 byte short int long float double boolean char
    //2.引用数据类型:类、数组、接口、字符串、枚举
    MyDate birthday;//引用数据类型类类型
}
