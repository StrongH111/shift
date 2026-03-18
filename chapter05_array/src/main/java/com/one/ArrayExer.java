package com.one;

public class ArrayExer {
    public static void main(String[] args) {
        //程序员找舍友
        int[] arr = new int[] {8,2,1,0,3};
        int [] index = new int[]{2,0,3,2,4,0,1,3,2,3,3};
        String telephone = "";
        for (int i = 0; i < index.length; i++) {
            telephone += arr[index[i]];
        }
        System.out.println(telephone);

    }
}
