package com.one;

public class OneArrayTest {
    public static void main(String[] args) {
        //声明数组
        int [] arr;
        //数组的初始化
        arr = new int[]{1,2,3,4,5};;
        //int arr[] = {1,2,3,4,5};
        double [] foods;
        foods = new double[]{20.32,43.21,43.22,54.21};
        String arr2[] = {"拌海蜇","龙须菜","炝冬笋"};
        //数组的声明和初始化格式：
/*      1.静态化初始化：数组的声明和数组元素的赋值是一起进行的
        int [] arr4;
        arr = new int[]{1,2,3,4,5};
        2.动态化初始化：先声明数组，再为数组分配内存空间，最后为数组元素赋值
        int arr6[] = new int[3];
        3.
        int arr7[] = {1,2,3,4,5};
        4. int arr8[] = {1,2,3,4}*/

        //数组调用 数组名[下标],下标从0开始，数组的长度是一开始就确定的，不能改变
        int a =arr[0];
        System.out.println(a);
        //数组下标访问数组元素时，下标不能超过数组长度，否则会报错，也不能是负数
        //System.out.println(arr[100]);

        //数组长度 数组名.length
        int b = arr.length;
        System.out.println(b);
        //遍历数组
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(arr[i]);

        }
        //不同类型数组的默认初始值
        int arr3[] = new int[5];//整形元素默认初始值为0
        double arr4[] = new double[5];//浮点型数组元素默认初始值为0.0
        String arr5[] = new String[5];//引用类型字符串元素默认初始值为null
        boolean arr6[] = new boolean[5];//Boolean数组元素默认初始值为false
        char arr7[] = new char[5];//字符型数组元素默认初始值为'\u0000'或0
        System.out.println(arr3[0]);
        System.out.println(arr4[0]);
        System.out.println(arr5[0]);
        System.out.println(arr6[0]);
        System.out.println(arr7[0]);
        //数组内存解析
        //数组是引用数据类型，数组名存储的是数组在内存中的首地址
        //数组元素是连续存储的，每个元素占用内存空间相同
        //栈中存储数组名和数组元素的下标
       // 栈中存储数组名和数组元素的下标，其对应的值为数组元素在堆中的首地址
        //堆中存储数组元素，每个元素占用内存空间相同




    }
}
