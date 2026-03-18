package test;

public class Test4 {
    //找出一百以内的素数--除了1和它本身以外，不能被其他数整除的数
    public static void main(String[] args) {
        long strat = System.currentTimeMillis();
        for(int i = 1; i<=100000;i++){
            boolean is_flag = true;
            //for(int j = 2;j<i;j++){
          for(int j = 2;j<Math.sqrt(i);j++){
                if(i % j == 0){
                   is_flag = false;
                }
            }
            if(is_flag){
                System.out.println(i);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时："+(end-strat)+"毫秒");
    }
}


