package com.test;

import java.util.Scanner;

public class Test1 {
    //输入一个整形数组，数组里有正数也有负数。
    // 数组中连续的一个或多个整数组成一个子数组，每个子数组都有一个和。
    // 求所有子数组的和的最大值。要求时间复杂度为O(n)。
    //例如：输入的数组为1, -2, 3, -10, -4, 7, 2, -5，和最大的子数组为3, 10, -4, 7, 2，
    // 因此输出为该子数组的和18。
    public static void main(String[] args) {
        int arr[] = {1, -2, 3, -10, -4, 7, 2, -5};
/*
        // 1.定义变量sum，max，sum用来存储子数组的和，max用来存储子数组的最大和
        int sum = arr[0];
        int max = arr[0];
        //2.遍历数组，从第一个元素开始，将sum初始化为第一个元素
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            if (sum > max) {
                max = sum;
            }
            System.out.println(sum);
        }
*/


    }
}
