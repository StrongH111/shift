package safe;

public class SaleTicket implements Runnable{
    private static int ticket = 100;

    @Override
    public void run() {
        while(ticket > 0){
            System.out.println(Thread.currentThread().getName()+"售出第"+ticket+"张票");
            ticket--;
        }
    }
}
class Test{
    public static void main(String[] args) {
        SaleTicket t = new SaleTicket();
        SaleTicket p = new SaleTicket();
        SaleTicket q = new SaleTicket();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(p);
        Thread t3 = new Thread(q);
        t1.start();
        t2.start();
        t3.start();
    }
}
