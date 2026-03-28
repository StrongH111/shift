package safe;

public class SaleTicket1 extends Thread{
    private static int ticket = 100;

    @Override
    public void run() {
        SaleTicket();
    }
    //静态方法锁
    public synchronized static void SaleTicket(){//锁对象是TicketSaleThread类的Class对象，而一个类的Class对象在内存中肯定只有一个
        while(ticket>0){
            System.out.println(Thread.currentThread().getName()+"售出第"+ticket+"张票");
            ticket--;
        }

    }
}
class Test1{
    public static void main(String[] args) {
        SaleTicket1 t = new SaleTicket1();
        SaleTicket1 p = new SaleTicket1();
        SaleTicket1 q = new SaleTicket1();
        t.start();
        p.start();
        q.start();
    }
}