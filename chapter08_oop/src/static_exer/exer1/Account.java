package static_exer.exer1;

public class Account {
    private int  id;
    private String password;
    private double balance;
    private static double annualInterestRate;
    private static double min_Balance = 1.0;
    private static int init = 1001;

    public Account() {
        this.id = init;
        init++;
    }

    public Account(String password, double balance) {
        this.password = "0000";
        this.balance = balance;
        this.id = init;
        init++;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public  static double getMin_Balance() {
        return min_Balance ;
    }

    public static void setMin_Balance(double min_Balance) {
        Account.min_Balance = min_Balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
