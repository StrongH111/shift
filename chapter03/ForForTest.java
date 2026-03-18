public class ForForTest {
    public static void main(String[] args) {
        //打印一个6个*
        for(int i = 0;i < 6;i ++){
            System.out.print("*");
        }
        System.out.println("===========================");
        //打印六行6个*
        for(int m = 0;m < 6;m++){
            for(int n = 0 ;n< 6;n++) {
                System.out.print("*");
            }
            System.out.println();
        }
//        *
//        **
//        ***
//        ****
//        *****
//        ******
        for(int a = 1;a < 6;a++){
            for(int b= 1;b<=a;b++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
