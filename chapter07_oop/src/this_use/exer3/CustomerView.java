package this_use.exer3;

import java.util.Scanner;

public class CustomerView {
    private CustomerList customerList = new CustomerList(10);
    public void enterMainMenu(){
        Scanner sc = new Scanner(System.in);
        boolean is_flag = true;
        while(is_flag){
            System.out.println("----------------------电商客户管理系统---------------------");
            System.out.println();
            System.out.println("\t\t\t1.添 加 客 户");
            System.out.println("\t\t\t2.修 改 客 户");
            System.out.println("\t\t\t3.删 除 客 户");
            System.out.println("\t\t\t4.客 户 列 表");
            System.out.println("\t\t\t5.退       出");
            System.out.println();
            System.out.print("请选择(1-5):");
            int choice = sc.nextInt();
            switch (choice){
                default :
                    System.out.println("输入错误，请重新输入");
                    break;
                case 1:
                    addNewCustomer();
                    break;
                case 2:
                    mofifyCustomer();
                    break;

                case 3:
                    deleteCustomer();
                    break;
                case 4:
                    listAllCustomers();
                    break;
                case 5:
                    System.out.println("谢谢使用");
                    is_flag = false;
                    break;
            }

        }

    }
    private void addNewCustomer(){

    }
    private void mofifyCustomer(){

    }
    private void deleteCustomer(){

    }
    private void listAllCustomers(){

    }

    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }
}
