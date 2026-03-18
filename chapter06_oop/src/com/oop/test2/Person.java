package com.oop.test2;

public class Person {
/*    (1)创建Person类的对象，设置该对象的name、age和gender属性，
        调用study方法，输出字符串"studying”;
        调用showAge()方法，返回age值;
        调用addAge(int addAge)方法给对象的age属性值增加addAge岁。比如:2岁。
     (2)创建第二个对象，执行上述操作，体会同一个类的不同对象之间的关系。*/

    //定义类的属性
    String name;
    int age;
    char gender;
    //定义类的方法
    public void study(){
        System.out.println("studying");
    }
    public int showAge(){
        return age;
    }
    public void addAge(int addAge) {
        age += addAge;

    }

}
