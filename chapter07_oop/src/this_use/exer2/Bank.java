package this_use.exer2;

public class Bank {
    private Customer customs[];
    private  int numberOfCustomers;
    public Bank(){
        customs = new Customer[10];//创建数组
    }
    public void addCustomer(String f,String l){
        Customer c = new Customer(f,l);//创建对象
        customs[numberOfCustomers] = c;//将对象添加到数组中
        numberOfCustomers++;//数组下标加1

    }
    public int getNumberOfCustomers(){
        return numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        if (index >= 0 && index < numberOfCustomers) {//判断下标是否合法
            return customs[index];
        } else {
            return null;

        }
    }
}
