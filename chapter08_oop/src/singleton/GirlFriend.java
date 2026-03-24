package singleton;

public class GirlFriend {
    //懒汉模式；`延迟加载`，即在调用静态方法时实例才被创建。
   //实现起来`简单`；没有多线程安全问题。
    //缺点：当类被加载的时候，会初始化static的实例，静态变量被创建并分配内存空间，
    // 从这以后，这个static的实例便一直占着这块内存，直到类被卸载时，静态变量被摧毁，
    // 并释放所占有的内存。因此在某些特定条件下会`耗费内存`。
    //类的构造器私有化
    private GirlFriend(){

    }
    //声明当前类的实例，相当于属性，声明为static
    private static GirlFriend instance = null;
    //使用getXxx()方法获取当前类的实例，必须声明为static
    //如果未创建对象，则在方法内部进行创建
    public static GirlFriend getInstance(){
        if(instance == null){
            instance = new GirlFriend();
        }
        System.out.println("调用了");
        return instance;
    }
}
