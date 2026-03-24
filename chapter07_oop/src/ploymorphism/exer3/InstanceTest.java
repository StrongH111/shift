package ploymorphism.exer3;


public class InstanceTest {
    public void method(Person e) {
        System.out.println(e.getInfo());
        if (e instanceof Graduate) {
            System.out.println("a graduate student");
        }
        if (e instanceof Student) {
            System.out.println("a student");
        }
        if (e instanceof Person) {
            System.out.println("a person");
        }
    }

    public static void main(String[] args) {
        InstanceTest test = new InstanceTest();
        test.method(new Person());
        test.method(new Student());
        test.method(new Graduate());

    }

}


class Person {
    protected String name = "person";
    protected int age = 50;

    public String getInfo() {
        return "Name: " + name + "\n" + "age: " + age;
    }
}

class Student extends Person {
    protected String school = "pku";

    public String getInfo() {
        return "Name: " + name + "\nage: " + age
                + "\nschool: " + school;
    }
}

class Graduate extends Student {
    public String major = "IT";

    public String getInfo() {
        return "Name: " + name + "\nage: " + age
                + "\nschool: " + school + "\nmajor:" + major;
    }
}
