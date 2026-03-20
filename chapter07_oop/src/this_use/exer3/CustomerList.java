package this_use.exer3;

public class CustomerList {
    private Customer[] customers;//用来保存客户对象数组
    int total = 0;//记录已保存客户对象的数量
    //构造器
    //初始化数组大小
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    public CustomerList() {
    }

    //添加客户到数组
    public boolean add(Customer customer) {
        if(total < customers.length) {
            customers[++total] = customer;
            return true;
        } else{
            System.out.println("数组已满");
        return false;
        }
    }

    //更新用户信息
    public boolean replaceCustomer(int index, Customer cust) {
        if (index >= 0 && index < total) {//index是数组下标
            customers[index] = cust;
            return true;
        }else{
            System.out.println("索引无效，无法替换");
            return false;
        }
    }
    //删除客户信息
    public boolean deleteCustomer(int index){
        if (index >= 0 && index < total) {
            for (int i = 0; i < total -1; i++) {
                customers[i] = customers[i+1];
                //将最后一个客户对象的引用设为null，释放内存
                customers[total -1] = null;
                total--;
            }
            return true;
        }else{
            System.out.println("输入有误");
        }
        return false;
    }
    //获取客户信息
    public Customer[] getAllCustomers(){
        if(total ==0){
            return null;
        }else {
            Customer[] c = new Customer[total];
            for (int i = 0; i < total; i++) {
                c[i] = customers[i];
            }
            return c;
        }

    }
    //获取指定索引位置的Customer对象
    public Customer getCustomer(int index){
        if (index >= 0 && index < total) {
            return customers[index];
        } else {
            return null;
        }
    }
    //获取当前用户数量
    public int getTotal(){
        return total;
    }



}

