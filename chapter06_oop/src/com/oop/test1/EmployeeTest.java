package com.oop.test1;

public class EmployeeTest {
    //在EmployeeTest测试类中的main()中，创建两个员工对象，并为他们的姓名和生日赋值，并显示
    public static void main(String[] args) {
        Employee empl1 = new Employee();
        empl1.id = 1001;
        empl1.name = "张三";
        empl1.age = 23;
        empl1.salary = 2000;
        //因为MyDate是引用数据类型，所以需要先创建MyDate对象，再赋值给empl1.birthday
        //MyDAte myd = new MyDate();
        //empl1.birthday = myd;
        empl1.birthday = new MyDate();
        //给MyDate对象赋值
        empl1.birthday.year = 1999;
        empl1.birthday.month = 12;
        empl1.birthday.day = 12;
        System.out.println(empl1.name+"的生日是："+empl1.birthday.year+"年"+empl1.birthday.month+"月"+empl1.birthday.day+"日");
    }
}
