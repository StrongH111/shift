package safe;

import java.awt.*;

public class Sale2 extends Thread{
    private static int ticket = 100;

    @Override
    public void run() {
        while(true) {
            synchronized (Window.class) {//Window.class表示当前类
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "售出第" + ticket + "张票");
                    ticket--;
                }
            }
        }

    }
}
class Test3{
    public static void main(String[] args) {
        Sale2 t = new Sale2();
        Sale2 p = new Sale2();
        Sale2 q = new Sale2();
        t.start();
        p.start();
        q.start();
    }
}
