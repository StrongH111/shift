package super_exer3;

public class Account {
    private int id;//账户id
    private double balance;//余额
    private double annualInterestRate;//年利率
    //构造器

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    public Account() {
    }
    //取款
    public void withdraw(double amount){
        if(amount >0 && amount <= balance){
            balance -= amount;
        }else{
            System.out.println("余额不足");
        }

    }
    //存款
    public void deposit(double amount){
        if(amount >0){
            balance += amount;
        }else{
            System.out.println("输入有误");
        }
    }
    //getter和setter方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate/12;
    }
}
class AccountTest{
    public static void main(String[] args) {
        Account account = new Account(1122,20000,4.5/100);
        account.withdraw(30000);
        System.out.println("当前余额为"+account.getBalance());
        System.out.println("当前年利率为"+account.getAnnualInterestRate());
        account.withdraw(2500);
        account.deposit(3000);
    }
}
