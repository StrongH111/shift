package com.test;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import javax.swing.plaf.metal.MetalIconFactory;

public class ArrayTest2 {
    /*    现有数组 int[] arr={1,2,3,4,5,6,7}。
        现需删除数组中索引为4的元素。*/
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
/*        //将索引为4后面的元素依次前移
        for(int i=4;i<arr.length -1;i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length-1] = 0;
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }*/
        System.out.println();
        //新建一个数组，将arr数组中索引为4前面的元素复制到新数组中
        int[] newArr = new int[arr.length-1];
        for (int i = 0; i < arr.length-1; i++) {
            if(i < 4) {
                newArr[i] = arr[i];
            }else if(i >=4){
                newArr[i] = arr[i+1];
            }
        }
        for (int i = 0; i < newArr.length; i++) {
        System.out.print(newArr[i]+" ");
        }

    }
}
