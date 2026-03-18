package com.oop.test;

public class EmployeeTest {
    public static void main(String[] args) {
    //声明EmployeeTest测试类，并在main方法中，创建2个员工对象，并为属性赋值，并打印两个员工的信息。
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        employee1.id  = 1001;
        employee1.name = "张三";
        employee1.age =23;
        System.out.println(employee1);//地址值
        System.out.println("员工1的信息如下：");
        System.out.println("编号："+employee1.id);
        System.out.println("姓名："+employee1.name);
        System.out.println("年龄："+employee1.age);
        employee2.id  = 1002;
        employee2.name = "李四";
        employee2.age =24;
        System.out.println(employee2);//地址值
        System.out.println("员工2的信息如下：");
        System.out.println("编号："+employee2.id);
        System.out.println("姓名："+employee2.name);
        System.out.println("年龄："+employee2.age);
    }
}
