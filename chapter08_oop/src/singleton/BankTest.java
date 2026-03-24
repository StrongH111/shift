package singleton;

public class BankTest {
    public static void main(String[] args) {
        //由于构造器私有化，外部不能new Bank()
//        Bank bank1 = new Bank();
//        Bank bank2 = new Bank();
        Bank bank1  = Bank.getInstance();
        Bank bank2  = Bank.getInstance();
        System.out.println(bank1 == bank2);
    }
}
