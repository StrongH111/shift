package com.oop.overload;

import java.io.InterruptedIOException;

public class Overload2 {
    public static void main(String[] args) {
        Overload2 o1 = new Overload2();
        o1.method(10);//优先选择可变个数形参的方法
        System.out.println("-------------------------------");
        Overload2 o2 = new Overload2();
        String str = o2.test("-","Hello","World","Java");
        System.out.println(str);
    }
    // 可变个数形参：方法名(参数的类型名 ...参数名)
    // 可变个数形参的方法与同名的方法之间构成重载
    public void method(int a){//与    public void method(int...a){构成重载
        System.out.println("一个int类型的参数");
    }
    public void method(int...a){//可变个数形参,接收一个或多个int类型的参数
        System.out.println("可变个数形参的方法");
        //遍历形参,把它看成数组的长度
        for(int i = 0;i < a.length;i++){
            System.out.println(a[i]);
        }
    }
    public void method(int a,int ...b){//int a 必须放在可变个数形参的前面
        System.out.println("两个int类型的参数");
    }
    //相当于
  //public void method(int[] a)  {}//二者不可同时声明
    public void method(String s,int...a){
        System.out.println("可变个数形参的方法");
    }
/*        n个字符串进行拼接，每一个字符串之间使用某字符进行分割，如果没有传入字符串，那么返回空字符串""*/
    public String test( String operator,String...str){
        String retu = "";

            for(int i = 0;i<str.length;i++){
                if(i == 0){
                    retu = str[i];
                }else{
                retu = retu+operator+str[i];
            }
        }
            return retu;
    }
}
