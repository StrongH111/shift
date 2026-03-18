package com.two;

public class ArrayExer2_2 {
    public static void main(String[] args) {
        //数组与数组之间的赋值
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = arr1;//arr2与arr1指向同一个数组
        arr2[4] = 100;
        System.out.println(arr1[4]);

        short z[] = {1,2,3};
        int x[]= new int[3];
        int y[][] = new int[3][4];
        //x = z;错误，类型不匹配
        //x = y;错误,二维数组不能赋值给一维数组
        //y = x;错误，一维数组不能赋值给二维数组
        x = y[0];// √
        //数组之间的赋值必须是相同类型的数组，维度相同，且数组元素的个数必须相同，
        // 数组的赋值是将数组的首地址赋值给另一个数组，而不是将数组元素赋值给另一个数组

        //一维数组
        int [] arr3 = {1,2,3,4,5};
        int  arr4[] = {1,2,3,4,5};
        //二维数组
        int [][] arr5 = {{1,2,3},{4,5,6}};
        int  arr6[][] = {{1,2,3},{4,5,6}};
        int [] arr7 [] = {{1,2,3},{4,5,6}};


    }
}
