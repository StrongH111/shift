package com.oop.test4;

public class Person {
/*    创建程序，在其中定义两个类:Person和PersonTest类。定义如下:
    用setAge()设置人的合法年龄(0~130)，用getAge()返回人的年龄。
    在PersonTest类中实例化Person类的对象b，调用setAge()和getAge()方法，体会Java的封装性。*/
    private int age;

    public static void main(String[] args) {
        Person b = new Person();
        b.setAge(18);
        System.out.println(b.getAge());
    }
    public void setAge(int age){
        if(age >=0 && age <=130){
            this.age = age;
        }else{
            System.out.println("您的输入有误");
        }
    }
    public int getAge(){
        return age;
    }
}
