package super_exer3;

public class CheckAccount extends Account{
    private double overdraft;//透支额度
    //构造器

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public CheckAccount(double overdraft) {
        this.overdraft = overdraft;
    }

    //重写父类的withdraw方法
    public void withdraw(double amount){
        if(amount <= getBalance()) {
            super.withdraw(amount);
        } else if(amount > getBalance()) {//如果取款金额大于余额
            double over = amount - getBalance();//计算需要透支的金额
            if (over <= overdraft) {//如果透支额度足够
                setBalance(0);
                overdraft -= over;
            } else {
                System.out.println("余额和透支额度都不够，取款失败");
            }
        }
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
}
class CheckAccountTset{
    public static void main(String[] args) {
        CheckAccount ca= new CheckAccount(1122,20000,4.5/100,5000);
        ca.withdraw(5000);
        System.out.println("当前余额为"+ca.getBalance());
        System.out.println("透支额度为"+ca.getOverdraft());
        ca.withdraw(18000);
        System.out.println("当前余额为"+ca.getBalance());
        System.out.println("透支额度为"+ca.getOverdraft());
        ca.withdraw(3000);
        System.out.println("当前余额为"+ca.getBalance());
        System.out.println("透支额度为"+ca.getOverdraft());
    }
}
