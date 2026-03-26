package finally_;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestFinally {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
        System.out.println("请输入第一个整数：");
        int a = input.nextInt();
        System.out.println("请输入第二个整数：");
        int b = input.nextInt();
        int result   = a/b;
        System.out.println(a + "/" + b +"=" + result);
        }catch(InputMismatchException e){
            e.printStackTrace();
        }catch(ArithmeticException e){
            System.out.println("除数不能为0");
        }finally{
            System.out.println("无论是否发生异常，都会执行finally中的代码");
            input.close();
        }

    }
}
