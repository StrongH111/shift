package com.oop.overload;

public class Overload1 {
    //方法的重载，在同一个类中，方法名相同，参数列表不同(类型不同或数量不同)
    //与返回值、修饰符无关，只看参数列表
/*    public void add(int i,int b){//
    }
    public void add(int i,char b){//参数类型不同
    }
    public static void add(int i,int b,int m){//参数数量不同
    }*/
/*   编写程序，定义三个重载方法并调用。
    方法名为mOL。
    三个方法分别接收一个int参数、两个int参数、一个字符串参数。分别执行平方运算并输出结果，相
    乘并输出结果，输出字符串信息。
    在主类的main()方法中分别用参数区别调用三个方法。*/

    public static void main(String[] args) {
        Overload1 o1 = new Overload1();
        o1.mOL(5);
        o1.mOL(5,5);
        o1.mOL("5*5 = 25");
        System.out.println("-----------------");
        Overload1 o2 = new Overload1();
        o2.max(2,3);
        o2.max(3.24,3.14);
        o2.max(3.24,3.14,3.14);

    }
    public void mOL(int m){
        System.out.println(m*m);
    }
    public void mOL(int m,int n){
        System.out.println(m*n);
    }
    public void mOL(String str){
        System.out.println(str);
    }
    /*    定义三个重载方法max()，第一个方法求两个int值中的最大值，第二个方法求两个double值中的
    最大值，第三个方法求三个double值中的最大值，并分别调用三个方法。*/
    public void max(int a,int b){
        if(a>b) {
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
    public void max(double a,double b){
        if(a>b) {
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
    public void max(double a,double b,double c){
        if(a>b&&a>c){
            System.out.println(a);
        }else if(b>a&&b>c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}


