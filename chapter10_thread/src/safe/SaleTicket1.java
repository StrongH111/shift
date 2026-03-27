package safe;

public class SaleTicket1 extends Thread{
    private static int ticket = 100;

    @Override
    public void run() {
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