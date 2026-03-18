package com.test;

public class Test4 {
    /*    创建一个长度为6的int型数组，要求数组元素的值都在1-30之间，且是随机赋值。
        同时，要求元素的值各不相同。*/
    public static void main(String[] args) {
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {// [0,1) [0,30) [1,31)
            arr[i] = (int) (Math.random() * 30) + 1;
            boolean flag = false;
            while (true) {
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    arr[i] = (int) (Math.random() * 30) + 1;
                    flag = false;
                    continue;
                }
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    //更优的方法
  //  @Test
/*    public void test2(){
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {// [0,1) [0,30) [1,31)
            arr[i] = (int) (Math.random() * 30) + 1;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }*/
    }

