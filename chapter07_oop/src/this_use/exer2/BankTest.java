package this_use.exer2;

public class BankTest {
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        bank1.addCustomer("操","曹");
        bank1.addCustomer("备","刘");
        bank1.getNumberOfCustomers();
        bank1.getCustomer(0).setAccount(new Account(100));
        bank1.getCustomer(0).getAccount().withdraw(100);
    }
}
