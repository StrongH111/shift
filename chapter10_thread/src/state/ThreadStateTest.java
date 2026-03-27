package state;

public class ThreadStateTest {
    public static void main(String[] args) {
        SubThread t = new SubThread();
        System.out.println(t.getName() +"状态: "+t.getState());
        t.start();
        while(Thread.State.TERMINATED != t.getState()){
            System.out.println(t.getName() +"状态: "+t.getState());
            try{
            Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(t.getName() +"状态: "+t.getState());

        }

    }
}
class SubThread extends Thread {
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 10; i++) {
                System.out.println("打印：" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            break;
        }
    }
}

