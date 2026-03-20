package this_use;

import jdk.swing.interop.SwingInterOpUtils;

public class PersonTest {

class Person {
    String name;
    int age;
    public Person(){

    }
    public Person(String name){
        this();//调用本类中的无参构造方法
        System.out.println();//一个构造器只能通过this调用一个构造器，且必须放在首行。
    }
    public Person(String name,int age){
        this(name);//调用本类中的有参构造方法
    }
    public void setName(String name){
        this.name = name;//this.name表示当前对象的name属性
    }//调不调用都是一个对象

    //如果形参和成员变量同名，必须使用this来区分
  //public int setAge(int age)  {
    //    age = age;//这里的两个age都表示的是形参，并没有给成员变量赋值
    // }
    public void setAge(int age){
        this.age = age;//this.age表示当前对象的age属性
    }
    public void eat(){
        System.out.println("人吃饭");
    }
    public void behaviour(){
        this.eat();//this.eat()表示当前对象的eat()方法，一般情况下省略不写
    }
}
}
