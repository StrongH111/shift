package com.test;

public class TestArrayElementSum {
    //平均值、最大值、最小值、总和
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        //总和、平均值
        int sum =0;
        int max = arr[0];
        int min = arr[0];
        int index = 0 ;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i]>max) {
                max = arr[i];
                //记录最大值的索引
                index = i;
            }else if (arr[i]<min) {
                min = arr[i];
            }
        }
        double avg = sum / arr.length;
        System.out.println("总和："+sum);
        System.out.println("平均值："+avg);
        System.out.println("最大值："+max);
        System.out.println("最小值："+min);
        System.out.println("最大值的索引："+index);

    }
}
