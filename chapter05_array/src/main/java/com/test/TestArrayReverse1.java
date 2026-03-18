package com.test;

public class TestArrayReverse1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int temp;
        // 交换数组中的元素
/*        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
*/
        for (int left = 0,right = arr.length-1; left <right ; left++,right--) {
             temp = arr[left];
             arr[left] = arr[right];
             arr[right] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
