package runable;

public class Demo {
    public static void main(String[] args) {
         Thread t = new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println(getPriority());
            }
        };
         t.start();
        t.setPriority(Thread.MAX_PRIORITY);

        System.out.println(t.getPriority());
    }
}