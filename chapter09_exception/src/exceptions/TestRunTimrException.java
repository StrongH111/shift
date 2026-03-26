package exceptions;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class TestRunTimrException {
    @Test
    public void test01() {
//   NullPointerException空指针异常
        int[][] arr = new int[3][];
        System.out.println(arr[0][0]);
    }

    @Test
    public void test02() {
// ClassCastExcpetion 类转换异常
        Object obj = 15;
        String str = (String) obj;
    }

    @Test
    public void test03() {
        int[] arr = new int[5];
        System.out.println(arr[5]);
        //ArrayIndexOutOfBoundException数组角标越界异常
    }

    @Test
    public void test04() {
        // InputMismatchException 输入不匹配异常
        String simulatedInput = "abc\n"; // 模拟输入非整数
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = input.nextInt(); // 这里会抛出 InputMismatchException
        input.close();
    }
    @Test
    public void test05(){
        int a =1;
        int b = 0;
        System.out.println(a/b);
        //ArithmeticException算术异常
    }
}
