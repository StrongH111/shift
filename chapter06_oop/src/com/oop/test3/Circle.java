package com.oop.test3;

public class Circle {
/*    定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个findArea()方法返回圆的面
    积。  （3）在main方法中调用
    printAreas()方法，调用完毕后输出当前半径值。*/
public static void main(String[] args) {
        Circle c= new Circle();
        c.radius = 5;
        double area = c.findArea(c.radius);
    System.out.println("圆的面积是："+area);
}
    double radius;
    public double findArea(double radius){
        return Math.PI * radius * radius;
    }
}
