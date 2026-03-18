import java.util.Scanner;

public class GuLiAccount {

    public static void main(String[] args) {
        double account = 0;
        String info = "";

        while(true) {
            System.out.println("-------------------谷粒记账软件-------------------");
            System.out.println("1.收支明细");
            System.out.println("2.登记收入");
            System.out.println("3.登记支出");
            System.out.println("4.退出");
            System.out.println("");
            System.out.println("请选择(1-4):");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.println("------------当前收支明细记录------------");
                    System.out.println("收支\t\t账户金额\t\t收支金额\t\t说明");
                    System.out.println(info);
                    System.out.println("-----------------------------------------");
                    System.out.println("");
                    System.out.println("-------------------谷粒记账软件-------------------");
                    break;
                case 2:
                    System.out.print("本次收入金额:");
                    double income = scanner.nextDouble();
                    account += income;
                    System.out.print("本次收入说明:");
                    String incomeInfo = scanner.next();
                    info += "收入\t\t"+account+"\t\t"+income+"\t\t"+incomeInfo+"\n";
                    System.out.println("-------------登记成功------------");
                    break;
                case 3:
                    System.out.print("本次金额:");
                    double check = scanner.nextDouble();
                    account -= check;
                    System.out.print("本次支出说明:");
                    String checkInfo = scanner.next();
                    info += "支出\t\t"+account+"\t\t"+check+"\t\t"+checkInfo+"\n";
                    System.out.println("-------------登记成功------------");
                    break;
                case 4:
                    System.out.println("是否确定退出(Y/N):");
                    String isExit = scanner.next();
                    if(isExit.equals("Y")){
                        System.out.println("退出成功");
                    }
                    break;
                default :
                    System.out.println("输入错误,请重新输入:");


            }
        }
    }
}
