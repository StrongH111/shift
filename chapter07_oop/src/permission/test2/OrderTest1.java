package permission.test2;

import permission.test1.Order;

public class OrderTest1{
    public void orderTest(){
        Order order = new Order();
        //  order. orderPrivate =1; //私有属性，出本类外不能直接访问
        //order.orderDefault =1;//默认属性，子类不能直接访问
        //order.orderProtected =1;//受保护的属性，别包下的非子类不能直接访问
        order.orderPublic =1;
        // order.methodPrivate();//私有方法，不能直接访问
        //order.methodDefault();//默认的方法，子类不能直接访问
        //order.methodProtected();//受保护的方法，别包下的非子类不能直接访问
        order.methodPublic();
    }
    }

