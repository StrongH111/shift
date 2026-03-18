package com.search;

import javax.xml.transform.dom.DOMResult;

public class TestArrayOrderSearch {
    public static void main(String[] args) {
        //顺序查找
        //查找value第一次在数组中出现的index
        int arr[] ={3,5,2,8,6,4,2,9,7};
        int value = 1;
        int index;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] == value) {
                index = i;
                System.out.println("index = " + index);
                break;
            }
            if(i == arr.length - 1) {
                System.out.println("未找到");
            }

        }
       /* int[] arr = {4,5,6,1,9};
        int value = 1;
        int index = -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == value){
                index = i;
                break;
            }
        }

        if(index==-1){
            System.out.println(value + "不存在");
        }else{
            System.out.println(value + "的下标是" + index);*/
    }
}
