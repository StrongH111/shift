package com.oop.method;

public class Person {
    //声明属性
    String name;
    int age;
    char gender;

    //声明方法的格式：
/*    权限修饰符  [修饰符] 返回值类型 方法名[throws 异常类](形参列表){
        方法体
    }
    权限修饰符：private 缺省 protected public
    修饰符(可选)：void static abstract final...
    返回值类型：基本数据类型和引用数据类型，
    void表示没有返回值，有返回值，return 方法声明的返回值类型
    方法名：遵循标识符的命名规则，见名知意
    形参列表:(数据类型 形参名1,数据类型 形参名2,...)
    方法独立存在，必须在类中定义，不能在方法中定义
    方法不调用不执行，调用时才会执行，调用一次执行一次


 */
    public void eat(){
        System.out.println("人在吃饭");
    }
    public void sleep(int hours) {//形参
        System.out.println("人在睡觉，共睡了" + hours + "小时");
    }
    public String getName() {//返回值类型为String
        return name;//return的作用：1.返回方法的结果 2.结束方法的执行
        //return后面不能有执行语句。
    }
    public void play(){
        eat(); //方法可以调用方法，没有先后顺序，
    }
}
