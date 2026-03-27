package runable;

public class Print {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                Thread.currentThread().setName("线程1") ;
                for (int i = 0; i <= 100; i++) {
                    if(i%2==0){
                        System.out.println(Thread.currentThread().getName() +" " +i);
                    }
                    try {
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }.start();

    }
}
