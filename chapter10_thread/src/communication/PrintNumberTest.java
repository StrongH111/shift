package communication;

public class PrintNumberTest {
    public static void main(String[] args) {
        Print p1 = new Print();
        Thread t1 = new Thread(p1,"线程1");
        Thread t2 = new Thread(p1,"线程2");
        t1.start();
        t2.start();
    }
}
class Print implements Runnable{
    private static int number = 1;

    @Override
    public void run() {
        while(true){
            synchronized (this) {
                notify();//唤醒一个等待程
                if(number < 100){
                    try {
                        Thread.sleep(100);//不会释放同步监视器
                    } catch (InterruptedException e) {
                         System.out.println(e);
                    }
                    System.out.println(Thread.currentThread().getName() + "打印" + number);
                    number++;
                    try {
                        wait();//线程一旦能进入此方法，就进入等待状态，同时会释放同步监视器
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
                else{
                    break;
                }
            }
        }
    }
}
