package com.oop.test4;

public class Employee {
    /*    声明员工类Employee,包含属性:姓名、性别、年龄、电话，属性私有化
        提供get/set方法提供String getInfo()方法
        在测试类的main中创建员工数组，并从键盘输入员工对象信息，最后遍历输出*/
    //属性私有化,提供get/set方法
    private int age;
    private String name;
    private char gender;
    private String Phone;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getPhone() {
        return Phone;
    }

    public String getInfo() {
        return  getName() + "\t\t" + getAge() + "\t\t" + getGender() + "\t\t" + getPhone();
    }
}
