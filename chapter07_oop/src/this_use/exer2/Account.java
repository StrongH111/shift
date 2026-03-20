package this_use.exer2;

public class Account {
    //成员变量
    private double balance;
    //构造器
    public Account(){

    }
    public Account( double balance){
        this.balance = balance;
    }
    //构造方法
    public double getBalance(){
        return balance;
    }
    public void deposit(double amt){
        if( amt >0){
            balance += amt;
            System.out.println("成功存入：" + amt);
        }else{
            System.out.println("输入有误");
        }

    }
    public void withdraw(double amt){
        if(amt >0 && amt <= balance){
            balance -= amt;
            System.out.println("成功取出：" + amt);
        }else{
            System.out.println("输入有误");
        }

    }

}
