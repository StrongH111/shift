package static_exer.exer1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("123456",2000);
        Account account2 = new Account("123",5000);
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(Account.getAnnualInterestRate());
        System.out.println(Account.getMin_Balance());
    }


}
