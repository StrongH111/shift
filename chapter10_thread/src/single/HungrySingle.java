package single;

public class HungrySingle {
    private static HungrySingle INSTANCE = new HungrySingle();
    private HungrySingle() {
    }

    public static HungrySingle getINSTANCE() {
        return INSTANCE;
    }
}
/*形式二
public enum HungryOne{
    INSTANCE
}*/
class HungrySingleTest{
    static HungrySingle hs1 = null;
    static HungrySingle hs2 = null;
    //演示存在的线程安全问题
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                hs1 = HungrySingle.getINSTANCE();
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                hs2 = HungrySingle.getINSTANCE();
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
        System.out.println(hs1);
        System.out.println(hs2);
        System.out.println(hs1 == hs2);//true

    }
}