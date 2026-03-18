import java.util.Scanner;

public class SwitchCaseTest3 {
    public static void main(String[] args) {
        //输入两个正数，求他们的最大公约数和最小公倍数
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入第一个正数：");
        int num1  = sc.nextInt();
        System.out.println("请输入第二个正数：");
        int num2  = sc.nextInt();
        int min = num1 > num2 ? num2:num1;
        int max = num1 >num2 ? num1:num2;
        //求最大公约数
        for(int i = min;min > 1;i--){
            if(num1 % i == 0 && num2 % i == 0){
                System.out.println("最大公约数是："+i);
                break;
            }
        }
        //求最小公倍数
        for(int j = max;;j++){
            if(j % num1 == 0 && j % num2 == 0){
                System.out.println("最小公倍数是："+j);
                break;
            }
        }

    sc.close();

    }
}
