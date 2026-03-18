package com.two;

import java.util.concurrent.ForkJoinPool;

public class TwoArray {
    public static void main(String[] args) {
        //二维数组的声明和初始化

        //1.二维数组的静态化初始化
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
       //int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}} ;
        char arr6[][] = {{'a','b','c'},{'d','e','f'}};
        //2.二维数组的动态化初始化
        int[][] arr2 = new int[3][4];
        String arr4[][] = new String[3][4];
        //3.二维数组的默认初始化
        int[][] arr3 = new int[3][];
        double arr5[][] = new double[3][];

        //二维数组的调用
        System.out.println(arr1[0][0]);
        System.out.println(arr1[1]);//外围数组元素的值是内维数组的类型和的首地址
      //System.out.println(arr2[3][5]);//数组下标越界会报错

        //数组的长度：内维数组和外围数组的长度都可以用length方法来获取
        System.out.println(arr1.length);//3
        System.out.println(arr1[0].length);//3

        //二维数组的遍历
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j]+" ");


            }
        }
        System.out.println("");

        //数组元素的默认初始化值
        int array1[][] = new int[3][4];
        System.out.println(array1[0][0]);//0
        System.out.println(array1[1]);//地址值

        boolean array2[][] = new boolean[2][1];
       // System.out.println(array2[0][0]);//false
        System.out.println(array2[1]);//地址值

        String array3[][] = new String[2][3];
        System.out.println(array3[0][0]);//null
        System.out.println(array3[1]);//地址值

        int array4[][] = new int[2][];
        System.out.println(array4[0]);//null
       // System.out.println(array4[1][1]);//会报错

        //二维数组的内存解析
        //数组变量名存储在栈空间，其对应的值是一个地址，指向堆空间中的外围数组元素的。
        //外围数组元素存储在堆空间，其对应的值是一个地址，指向堆空间中的内维数组元素的。



    }

}
