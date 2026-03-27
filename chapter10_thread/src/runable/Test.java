package runable;

public class Test {

    public static void main(String[] args) {
        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"：" + i);
                }
            }
        }).start();
        Test1 t1 = new Test1();
        Thread t = new Thread(t1);
        t.setName("线程1");
        try {
            Thread.sleep(1000);

        }catch(InterruptedException e){
            e.printStackTrace();
        }
        Thread.yield();
        t.start();
        Thread t2 = new Thread(t1);
        t2.start();
    }

}
class Test1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 != 0){
                System.out.println(Thread.currentThread().getName() +":"+i);
            }
        }
    }
}
