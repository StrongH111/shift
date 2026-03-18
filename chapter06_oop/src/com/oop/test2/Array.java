package com.oop.test2;

public class Array {
    /*    自定义一个操作int[]的工具类。涉及到的方法有:
        求最大值、最小值、总和、平均数、遍历数组、
        复制数组、数组反转、数组排序(默认从小到大排序)、查找等*/
    public static void main(String[] args) {
        Array array = new Array();
        int[] arr = new int[]{32, 657, 2, 78, 315, 8, 43, 86, 859};
        //调用max方法
        int max = array.max(arr);
        System.out.println("数组中的最大值为：" + max);
        //调用avg方法
        double avg = array.avg(arr);
        System.out.println("数组中的平均值为：" + avg);
        //调用print方法
        array.print(arr);
        //调用copy方法
        array.copy(arr);
        //调用reverse方法
        array.reverse(arr);
        //调用sort方法
        array.sort(arr);
        //调用find方法
        int index = array.find(arr, 10);
        System.out.println("数组中43的索引为：" + index);
    }

    //*求数组中最大值*/
    public int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //*求数组中最小值*/
    public int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    //*求数组总和*/
    public int sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //*求数组平均数*/
    public double avg(int arr[]) {
        sum(arr);
        return sum(arr) / arr.length;
    }

    //*遍历数组*/
    public void print(int arr[]) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print(arr[i]);
            } else {
                System.out.print("," + arr[i]);
            }
        }
        System.out.println("]");
    }

    //*复制数组*/
    public void copy(int arr[]) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            arr2[i] = arr[i];
        }
        print(arr2);
    }

    //*数组反转*/
    public void reverse(int arr[]) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            arr2[arr.length - 1 - i] = arr[i];
        }
        print(arr2);
    }

    //*数组排序*/
    public void sort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        print(arr);
    }

    //*查找指定元素*/
    public int find(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
