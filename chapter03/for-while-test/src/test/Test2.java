package test;

public class Test2 {

    /*打印菱形
--------*           1  8 2 6 k=-2 b=
      * * *        1=k+b,3 = 2k+b---k=2b=-1
    * * * * *
  * * * * * * *
* * * * * * * * *    1 8 2 6 3 4 4 2 5  10
  * * * * * * *
    * * * * *    1 2  1 7 2 5 3 3

      * * *
        *
    * */
    public static void main(String[] args) {
        //上半部分
        for (int i = 1; i <= 5; i++) {
            for(int j = 1;j <= 10 - 2*i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //下半部分
        for(int i =1;i <=4;i++){
            for(int j = 1; j<=2*i; j++){
                System.out.print(" ");
            }
            for(int k =1;k<= 9-2*i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}

