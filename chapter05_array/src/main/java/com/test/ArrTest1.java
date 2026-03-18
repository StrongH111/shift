package com.test;

import com.sun.jdi.PathSearchingVirtualMachine;

public class ArrTest1 {
    public static void main(String[] args) {
/*      现有数组 int[] arr = new int[]{1,2,3,4,5};
        现将数组长度扩容1倍，并将10,20,30三个数据添加到arr数组中，如何操作？*/
        int arr1[] = new int[]{1,2,3,4,5};
        //数组长度一旦确定不能更改，只能创建新数组
        int arr2[] = new int[arr1.length <<2];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        arr2[arr1.length] = 10;
        arr2[arr1.length+1] = 20;
        arr2[arr1.length+2] = 30;
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
