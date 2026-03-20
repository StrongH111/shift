package this_use.exer2;

public class Customer {
    private String firatName;//姓
    private String lastName;//名
    private Account account;
    //构造器

    public Customer(String lastName, String firatName) {
        this.lastName = lastName;
        this.firatName = firatName;
    }
    //get/set方法

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getFiratName() {
        return firatName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }
}
