package com.oop.exer2;

public class AnimalsTest {
    public static void main(String[] args) {
        Animals a1 = new Animals();
        //成员变量，有默认值，不赋值的话会有默认初始化值
        a1.age = 1;
        System.out.println(a1.kind);

        //方法和局部变量
        a1.eat();
        a1.sleep(8);//局部变量没有默认值，必须赋值
        a1.play();//局部变量没有默认值，必须赋值
    }
}
