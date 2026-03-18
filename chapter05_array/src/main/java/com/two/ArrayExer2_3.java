package com.two;

public class ArrayExer2_3 {
    public static void main(String[] args) {
        String[][] employees = {{"10", "张三", "男", "28", "Java", "15000", "2000"}, {"12", "李四", "男", "24", "C++", "14000"}, {"13", "王五", "女", "22", "Python", "13000", "1000"}, {"10", "赵六", "女", "25", "UI", "12000"}, {"11", "王二", "男", "26", "Java", "14000", "2000"}, {"11", "王大", "男", "27", "safe", "15000", ""}, {"10", "王小", "男", "28", "Java", "15000", "2000"}

        };
        System.out.println("员工类型\t姓名\t性别\t年龄\t方向\t月工资\t奖金");
        for (int i = 0; i < employees.length; i++) {
            switch (employees[i][0]) {
                case "10":
                    employees[i][0] = "Java工程师";
                    break;
                case "11":
                    employees[i][0] = "大数据工程师";
                    break;
                case "12":
                    employees[i][0] = "高级讲师";
                    break;
                case "13":
                    employees[i][0] = "资深讲师";
                    break;
            }
                for (int j = 0; j < employees[i].length; j++) {

                    System.out.print(employees[i][j]+" ");


                }
            System.out.println("");
        }


    }
}
