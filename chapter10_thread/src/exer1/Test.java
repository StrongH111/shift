package exer1;

public class Test{
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        Test2 t2 = new Test2();
        t1.start();
        t2.start();//strat开启线程
        t1.run();//只是在main方法中调用子类重写的run()方法
        //thread匿名子类的调用方法
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i);
                }
            }
        }.start();
            }
}
