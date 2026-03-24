package abstract_exer.exer1;

import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[4];
        employees[0] = new SalariedEmployee("张三",1001,new MyDate(1,1,2000),5000);
        employees[1] = new HourlyEmployee("李四",1002,new MyDate(2,2,2000),40,100);
        employees[2] = new SalariedEmployee("王五",1003,new MyDate(3,3,2000),5050);
        employees[3] = new HourlyEmployee("赵六",1004,new MyDate(4,4,2000),50,100);
        System.out.println("请输入本月月份：");
        int month = sc.nextInt();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());


            if(month == employees[i].getBirthday().getMonth()){
                System.out.println("生日快乐！");
                System.out.println("加薪100");
            }
        }
    }
}
