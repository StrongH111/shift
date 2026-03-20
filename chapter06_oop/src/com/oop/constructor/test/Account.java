package com.oop.constructor.test;

import java.util.Scanner;

public class Account {
    /*写一个名为Account的类模拟账户。该类的属性和方法如下图所示。
        该类包括的属性：账号id，余额balance，年利率annualInterestRate；
        包含的方法：访问器方法（getter和setter方法），取款方法withdraw()，存款方法deposit()
     */

    //私有化属性，禁止在类外直接访问
    private int id;
    private double balance;
    private double annualIntereatRate;
    //构造器
    public Account(int d, double b, double a) {
        id = d;
        balance = b;
        annualIntereatRate = a;
    }

    //getter和setter方法获取属性值
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;

    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("您的输入有误");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setAnnualIntereatRate(double a) {
        if (a >= 0 && a <= 1) {
            annualIntereatRate = a;
        } else {
            System.out.println("您的输入有误");
        }
    }

    public double getAnnualIntereatRate() {
        return annualIntereatRate;
    }

    //取款方法
    public void withdraw(double amount) {
        if (amount <= balance && amount >0) {
            balance -= amount;
            System.out.println("成功取出" + amount);
        } else {
            System.out.println("您的余额不足，取款失败");
        }
    }

    public void desposit(double amount) {
        if (amount >= 0) {
            balance += amount;
            System.out.println("成功存入：" + amount);
        } else {
            System.out.println("您的输入有误");
        }
    }
}
