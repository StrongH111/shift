package permission.test1;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
      //  order. orderPrivate =1; //私有属性，不能直接访问
        order.orderDefault =1;
        order.orderProtected =1;
        order.orderPublic =1;
       // order.methodPrivate();//私有方法，不能直接访问
        order.methodDefault();
        order.methodProtected();
        order.methodPublic();

    }
}
