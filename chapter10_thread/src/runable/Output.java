package runable;
@Deprecated
public class Output {
    public static void main(String[] args) {
        Thread o = new Thread(){
            @Override
            public void run() {
                Thread.currentThread().setName("线程2");
                for (int i = 0; i < 100; i++) {
                    if(i % 2 != 0){
                        System.out.println(Thread.currentThread().getName()+" " +i);
                    }
                    if(i == 5) {
                        try {
                            sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        o.start();

    }
}
