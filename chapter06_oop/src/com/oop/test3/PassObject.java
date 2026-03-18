package com.oop.test3;

public class PassObject {
/*    （2）定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义如下：public void
    printAreas(Circle c, int time)，在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面

    积。例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。*/
public static void main(String[] args) {
    PassObject pao = new PassObject();
    Circle c1 = new Circle();
    pao.printAreas(c1,5);

}
    public void printAreas(Circle c, int time){
        for (int i = 1; i <= time; i++) {
            c.findArea(i);
            System.out.println("半径为" + i + "的圆面积为：" + c.findArea(i));
        }
    }
}
