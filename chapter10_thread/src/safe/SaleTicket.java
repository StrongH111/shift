package safe;

public class SaleTicket implements Runnable{
    private static int ticket = 100;

    @Override
    public void run(){//如果锁这里会导致只有一个窗口在卖票
        SaleOneTicket();
    }
    public synchronized void SaleOneTicket(){//锁对象是this，这里就是TicketSaleRunnable对象，因为上面3个线程使用同一个TicketSaleRunnable对象，所以可以
        while(ticket > 0){
            System.out.println(Thread.currentThread().getName()+"售出第"+ticket+"张票");
            ticket--;
        }
    }
}
class Test{
    public static void main(String[] args) {
        SaleTicket t = new SaleTicket();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        t1.start();
        t2.start();
        t3.start();
    }
}
