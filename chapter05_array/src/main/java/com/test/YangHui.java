package com.test;

public class YangHui {
    public static void main(String[] args) {
        //定义二维数组,打印10行
        int [][] arr = new int[10][];
        //先把数组打印出来
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i+1];
            //第一列和最后一列都是1
            arr[i][0] = 1;
            arr[i][i] =1;
            for (int j = 0; j < arr[i].length; j++) {
                if (j>0&&j<i) {
                    //中间的数是上面两个数之和
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
