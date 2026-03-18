import java.util.Scanner;
public class ScannerTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的身高：");
        double height = sc.nextDouble();
        System.out.println("请输入您的财产：");
        double money = sc.nextDouble();
        System.out.println("请输入您是否英俊（true/false）：");
        boolean is_pretty = sc.nextBoolean();
        if (height > 1.8 && money > 1000000 && is_pretty) {
            System.out.println("恭喜您符合条件！");
        }else if(height > 1.8 || money > 1000000 || is_pretty){
            System.out.println("您的条件一般");
        }else{
            System.out.println("滚");
        }
        sc.close();
    }

}
