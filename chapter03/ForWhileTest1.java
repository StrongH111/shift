import java.util.Scanner;

public class ForWhileTest1 {
    //从键盘上读取个不确定的整数，并判断读入的正数和负数的个数，输入0结束

    public static void main(String[] args) {
        int positiveNum = 0;
        int negativeNum = 0;
        for(;;){
            System.out.println("请输入任意整数:");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if(num > 0){
                positiveNum++;
            }else if(num < 0){
                negativeNum++;
            }else {
                break;
            }
            sc.close();
        }
        System.out.println("正数的个数为"+positiveNum);
        System.out.println("负数的个数为"+negativeNum);
    }
}
