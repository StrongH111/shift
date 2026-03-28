package zhe;

public class ProducerConsumerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer pro1 = new Producer(clerk);
        Consumer con1 = new Consumer(clerk);
        Consumer con2 = new Consumer(clerk);
        pro1.setName("生产者1");
        con1.setName("消费者1");
        con2.setName("消费者2");

        pro1.start();
        con1.start();
        con2.start();
    }
}

class Clerk {
    private int productNum = 0;//产品的数量

    //增加产品数量的方法
    public synchronized void addProduct() {
        if (productNum >= 20) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            productNum++;
            System.out.println(Thread.currentThread().getName() + "生产了第" + productNum + "个产品");
            notifyAll();
        }


    }

    //减少产品数量的方法
    public synchronized void removeProduct() {
        if (productNum <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println(Thread.currentThread().getName() + "购买了第" + productNum + "个产品");
            productNum--;
            notifyAll();
        }

    }
}

class Producer extends Thread {
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("生产者开始生产产品...");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.addProduct();
        }

    }
}

class Consumer extends Thread {
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("消费者购买产品产品...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.removeProduct();
        }

    }
}
