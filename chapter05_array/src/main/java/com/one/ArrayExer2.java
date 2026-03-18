package com.one;

import java.util.Scanner;

public class ArrayExer2 {
    public static void main(String[] args) {
/*        学生考试等级划分
                从键盘读入学生成绩，找出最高分并输出学生等级
                成绩 >= 最高分-10 A
                成绩 >= 最高分-20 B
                成绩 >= 最高分-30 C
                其余 D*/
        System.out.print("请输入学生人数:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("请输入学生成绩:");
        //创建数组，保存学生成绩
        int scores[] = new int[num];
        int max = scores[0];
        for (int i = 0; i < num; i++) {
            scores[i] = sc.nextInt();
            max = (scores[i] > max) ? scores[i] : max;
        }
        System.out.println("最高分是:" + max);
        for (int i = 0; i < num-1; i++) {
            char grade;
            if (scores[i] >= max - 10) {
                grade = 'A';
            } else if (scores[i] >= max - 20) {
                grade = 'B';
            } else if (scores[i] >= max - 30) {
                grade = 'C';
            } else
                grade = 'D';
            System.out.println("student "+ i+1 + " grade is: " + grade);

        }
        sc.close();
    }


}
