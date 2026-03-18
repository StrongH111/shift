package com.test;

public class Test2 {
/* （1）在编程竞赛中，有10位评委为参赛的选手打分，
    分数分别为：5，4，6，8，9，0，1，2，7，3
 （2）求选手的最后得分（去掉一个最高分和一个最低分后其余8位评委打分的平均值）*/
    public static void main(String[] args) {
        int arr[] ={5,4,6,8,9,0,1,2,7,3};
        //声明变量sum，max，min，sum用来存储子数组的和，max用来存储子数组的最大和，min用来存储子数组的最小和
        int sum=0;
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            sum +=arr[i];
        }
        sum = sum-max-min;
        System.out.println("去掉一个最高分"+max+"和一个最低分"+min+"选手的最后得分是："+sum/(arr.length-2));
    
}
}
