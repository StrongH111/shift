package com.oop.test4;

import java.util.Scanner;

public class EmployeeTest {
    /*在测试类的main中创建员工数组，并从键盘输入员工对象信息，最后遍历输出*/
    //属性私有化,提供get/set方法
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] emp = new Employee[3];

        for (int i = 0; i < emp.length; i++) {
            emp[i] = new Employee();
            System.out.println("=====添加第"+(i+1)+"个员工的信息====");
            System.out.print("姓名：");
            emp[i].setName(sc.next());
            System.out.print("年龄：");
            emp[i].setAge(sc.nextInt());
            System.out.print("性别：");
            emp[i].setGender(sc.next().charAt(0));
            System.out.print("电话：");
            emp[i].setPhone(sc.next());
        }
        System.out.println("=====员工信息如下====");
        System.out.println("姓名\t年龄\t性别\t电话");
        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i].getInfo());
        }
        System.out.println("=====程序结束====");
    }
}
