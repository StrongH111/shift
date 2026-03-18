import java.util.Scanner;

public class DoWhileTest1 {
    //模拟ATM取款
    public static void main(String[] args) {
        //账户余额
        int balance = 0;
        //表示金额
        int money = 0;
        //循环控制
        boolean flag = true;
        do{
        System.out.println("===========ATM============");
        System.out.println("1、取款");
        System.out.println("2、存款");
        System.out.println("3、显示余额");
        System.out.println("4、退出");
        System.out.println("请选择操作(1-4)：");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("请输入取款金额：");
                    money = sc.nextInt();
                    if ( money > 0 && money < balance) {
                        balance -= money;
                        System.out.println("取款成功");
                    } else {
                        System.out.println("输入有误或余额不足");
                    }

                    break;
                case 2:
                    System.out.println("请输入存款金额：");
                    money = sc.nextInt();
                    if(money < 0){
                        System.out.println("输入有误");
                    }else{

                        balance += money;
                        System.out.println("存款成功");
                    }
                    break;
                case 3:
                    System.out.println("余额为：" + balance);
                    break;
                case 4:
                    flag = false;
                    System.out.println("退出成功");
                    break;
                default:
                    System.out.println("输入错误");
            }
        } while (flag);

    }
}
