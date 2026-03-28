package lock;

import safe.Sale2;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest extends Thread {
    private static int ticket = 100;
    //创建lock实例，需确保多个线程共用同一个lock实例，static必不可少
    private static final ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();//上锁
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "售出第" + ticket + "张票");
                    ticket--;
                }
            }finally {
                lock.unlock();//开锁
            }
        }
    }
}

class Test3 {
    public static void main(String[] args) {
        LockTest t = new LockTest();
        LockTest p = new LockTest();
        LockTest q = new LockTest();
        t.start();
        p.start();
        q.start();
    }
}
