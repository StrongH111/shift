package com.oop.constructor.test;

public class Custom {
    /*a. 声明三个私有对象属性：firstName、lastName和account。 b. 声明一个公有构造器，这个构造器带有
两个代表对象属性的参数（f和l） c. 声明两个公有存取器来访问该对象属性，方法getFirstName和
getLastName返回相应的属性。 d. 声明setAccount 方法来对account属性赋值。 e. 声明getAccount 方法以
获取account属性。
3.写一个测试程序。
（1）创建一个Customer ，名字叫 Jane Smith, 他有一个账号为1000，余额为2000元，年利率为 1.23％ 的
账户。 （2）对Jane Smith操作。 存入 100 元，再取出960元。再取出2000元。 打印出Jane Smith 的基本
信息*/
    private String FirstName;
    private String lastName;
    private Account accont;
    //main方法
    public static void main(String[] args) {
        Custom c = new Custom("Jane","Smith");
        Account account = new Account(1000,2000,1.23/100);
        c.setAccount(account);
        account.desposit(100);
        account.withdraw(960);

    }

    //构造器
    public Custom(String f, String l) {
        FirstName = f;
        lastName = l;
    }
    public Custom(){

    }

    //存取器
    public String getFirstName(String f) {
            return f;
    }

    public String getLastName(String l) {
            return l;
    }
    // 声明setAccount 方法来对account属性赋值。
    public void setAccount(Account a) {
        accont = a;

    }
    // 声明getAccount 方法以获取account属性。
    public Account  getAccount(Account a) {
        return a;
    }
}



