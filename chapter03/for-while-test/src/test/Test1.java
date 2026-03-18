package test;
public class Test1 {
    /*
    *
    **
    ***
    ****
    *****
    ******
    ----------------
    *****
    ****
    ***
    **
    *
    *  */
    public static void main(String[] args) {
        //上半部分
        for(int i = 1;i <= 6; i++){
            for (int j = 1; j <= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //下半部分
        for(int m = 1;m <= 5;m++){
            for(int n= 1;n <= 6-m;n++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
