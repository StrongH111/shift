package com.search;

public class BinarySearch {
    //二分查找,要求数组元素必须是有序的
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int value = 10;
        int head = 0;
        int end = arr.length - 1;
        boolean isFlag = true;
        int index;
        //循环查找，直到head大于end
/*        while(head <= end){
            int middle = (head + end) / 2;
            if(arr3[middle] == value){
                System.out.println("找到指定的元素，索引为：" + middle);
                isFlag = false;
                break;
            }else if(arr3[middle] > value){
                end = middle - 1;
            }else{//arr3[middle] < value
                head = middle + 1;
            }
        }

        if(isFlag){
            System.out.println("未找打指定的元素");
        }*/
        while (head <= end) {
            index = (head + end) / 2;
            if (value == arr[index]) {
                System.out.println("找到了，下标是" + index);
                break;
            } else if (value > arr[index]) {
                head = index + 1;
            } else
                end = index - 1;
        }
        if (head > end) {
            System.out.println("未找到");
        }

    }
}

