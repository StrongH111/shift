import java.util.Scanner;

//switch穿透练习
//输入任意年份月份和天数，判断是这一年的多少天
public class SwitchCaseTest2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        System.out.println("请输入天数：");
        int day = sc.nextInt();
        int sumdays = 0;
        switch(month){
            case 12:
                sumdays += 30;
            case 11:
                sumdays += 31;
            case 10:
                sumdays += 30;
            case 9:
                sumdays += 31;
            case 8:
                sumdays += 31;
            case 7:
                sumdays += 30;
            case 6:
                sumdays += 31;
            case 5:
                sumdays += 31;
            case 4:
                sumdays += 30;
            case 3:
                if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                    sumdays += 28;
                }else {
                    sumdays += 29;
                }
            case 2:
                sumdays += 31;
            case 1:
                sumdays += day;
        }
        System.out.println("这是第" + year + "年的第" + sumdays + "天");
        sc.close();
    }
}
