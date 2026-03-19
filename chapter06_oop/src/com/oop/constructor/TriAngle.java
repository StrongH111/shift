package com.oop.constructor;

public class TriAngle {
    //编写两个类，TriAngle和TriAngleTest，
    // 其中TriAngle类中声明私有的底边长base和高height,同时声明公共方法访问私有变量。
    // 此外，提供类必要的构造器。另一个类中使用这些公共方法，计算三角形的面积。
    //私有变量
    private double base;
    private double height;
    //构造器
    public TriAngle(double b){
        base = b;
    }
    public TriAngle(double b,double h){
        base = b;
        height = h;
    }
    public TriAngle(){

    }
    public double getArea(){
        return base *height / 2;
    }
    public double getArea(double b,double h){
        return b *h / 2;
    }

    //声明公共方法访问私有变量
    public void setBase(double d){
        base = d;
    }
    public void setHeight(double h){
        height = h;
    }
    public double getBase(){
        return base;
    }
    public double getHeight(){
        return height;

    }
}
