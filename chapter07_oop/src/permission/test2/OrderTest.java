package permission.test2;

import permission.test1.Order;

import javax.security.auth.kerberos.KerberosCredMessage;

public class OrderTest extends Order {
    public static void main(String[] args) {
        OrderTest order = new OrderTest();
        //  order. orderPrivate =1; //私有属性，出本类外不能直接访问
        //order.orderDefault =1;//默认属性，子类不能直接访问
        order.orderProtected =1;
        order.orderPublic =1;
        // order.methodPrivate();//私有方法，不能直接访问
        //order.methodDefault();//默认的方法，子类不能直接访问
        order.methodProtected();
        order.methodPublic();

    }
}
