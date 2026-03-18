package com.oop.test2;

public class Circle {
    public static void main(String[] args) {
        //创建Circle对象
        Circle c1 = new Circle();
        double area = c1.are(5.5);
        System.out.println("圆的面积是："+area);
    }
    //设计一个类，计算圆的面积

    //属性：半径
     double Pi = 3.14;
     //方法：计算面积
    public double are(double radius){
        return Pi*radius*radius;
    }
}
