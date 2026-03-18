package com.one;

import java.util.Scanner;

public class ArrayExer1 {
    public static void main(String[] args) {
       // 用一个数组，保存星期一到星期天的英文，从键盘输入1-7，显示对应的单词
        String weeks[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println("请输入数字(1-7)：");
        int days = new Scanner(System.in).nextInt();
        System.out.println(weeks[days-1]);

    }
}
