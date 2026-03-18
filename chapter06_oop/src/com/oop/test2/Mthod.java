package com.oop.test2;

import java.text.Normalizer;

public class Mthod {
/*
1.编写程序，声明一个method1方法，在方法中打印一个10*8的*型矩形，在main方法中调用该方法。
2.编写程序，声明一个method2方法，除打印一个10*8的*型矩形外，
    再计算该矩形的面积，并将其作为方法返回值。
    在main方法中调用该方法，接收返回的面积值并打印。
3，编写程序，声明一个method3方法，在method3方法提供m和n两个参数，
    方法中打印一个m*n的*型矩形，并计算该矩形的面积，将其作为方法返回值。
    在main方法中调用该方法，接收返回的面积值并打印。*/

    public static void main(String[] args) {
        Mthod m1 = new Mthod();
        m1.method1();
        System.out.println();
        double area1 = m1.method2();
        System.out.println();
        double area2 = m1.method3(10,8);
        System.out.println();
        System.out.println(area1);
        System.out.println(area2);
    }

    public void method1(){
        for(int i = 1;i<=10;i++){
            for(int j = 1;j<=8;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public double method2(){
        method1();
        return 10*8;
    }
    public double method3(double m,double n){
        for(int i = 1;i<=m;i++){
            for(int j = 1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        return m*n;
    }
}
