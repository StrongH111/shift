package safe;

public class Sale implements Runnable {
    private static int ticket = 100;

    @Override
    public void run() {//如果锁这里会导致只有一个窗口在卖票
            while (true) {
                synchronized (this) {//这里的this表示当前类的对象
                    if (ticket > 0) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            System.out.println(e);
                        }
                        System.out.println(Thread.currentThread().getName() + "售出第" + ticket + "张票");
                        ticket--;
                    } else {
                        break;
                    }
                }
        }
    }
}
class Test2{
    public static void main(String[] args) {
        Sale t = new Sale();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        t1.start();
        t2.start();
        t3.start();
    }
}


