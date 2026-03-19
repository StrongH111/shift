package com.oop.constructor;

public class Student {
    //定义一个Student类 包括String name;int age;String school;String major四个属性;
/*    定义Student类的3个构造器:Student(String n,int a)设置类的name和age属性;
 第二个构造器Student(String n,int a,String s)设置类的name,age 和school属性;
 第三个构造器Student(String n, int a, String s, String m)设置类的name, age ,school和major属性;
 在main方法中分别调用不同的构造器创建的对象，并输出其属性值。*/
    private String name;
    private int age;
    private String school;
    private String major;

    public static void main(String[] args) {
        Student s = new Student();//这里的Student（）就是构造器，你不写Java默认就会生成一个无参构造器
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 19, "西安邮电大学");
        Student s3 = new Student("王五", 20, "西安邮电大学", "软件工程");
        System.out.println(s1.name + s1.age+ s1.school+ s1.major);
        System.out.println(s2.name + s2.age + s2.school + s2.major);
        System.out.println(s3.name + s3.age + s3.school + s3.major);
    }

    //构造器：权限修饰符 类名(参数列表)    调用构造器时，必须使用new关键字
    //一旦写了构造器，那么Java就不会生成无参构造器，如要使用自己写的无参构造器，必须显示的写出来
    public Student() {
    }

    public Student(String n, int a) {//调用构造器时，传入参数值，直接为属性赋值
        name = n;
        age = a;
    }

    //构造器重载：方法名相同，参数列表不同
    public Student(String n, int a, String s) {
        name = n;
        age = a;
        school = s;
    }

    public Student(String n, int a, String s, String m) {
        name = n;
        age = a;
        school = s;
        major = m;

    }
}