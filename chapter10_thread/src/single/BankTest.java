package single;

public class BankTest {
    static Bank b1 = null;
    static Bank b2 = null;
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                b1 = Bank.getInstance();
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                b2 = Bank.getInstance();
            }
        };
        t1.start();
        t2.start();
        try{
        t1.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        try{
        t2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(b2);
        System.out.println(b1);
        System.out.println(b1 == b2);
    }
}
class Bank{
    private Bank(){}
    private static  volatile Bank instance = null;

/*    方法1
    public static synchronized  Bank getInstance() {//同步监视器。默认为Bank.class
        if(instance == null){
            try{
            Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            instance = new Bank();
        }
        return instance;
    } */
/*  方式2
    public static  Bank getInstance() {//同步监视器。默认为Bank.class
        synchronized (Bank.class) {
            if(instance == null){
                try{
                Thread.sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                instance = new Bank();
            }
            return instance;
        }
    } */
    public static  Bank getInstance() {
        if (instance == null) {
            synchronized (Bank.class) {
                if (instance == null) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new Bank();
                }
//比方式1，2都快，后面的线程不进入到锁中直接return,但有指令重排的风险
// 为了避免指令重排，要在instance前加volatile

            }
        }
        return instance;
    }
}