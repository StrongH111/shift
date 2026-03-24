package singleton;

public class Bank {
    //饿汉模式：使用类的时候已经将对象创建完毕。
    //优点：实现起来`简单`；没有多线程安全问题。
    //缺点：当类被加载的时候，会初始化static的实例，静态变量被创建并分配内存空间，
    // 从这以后，这个static的实例便一直占着这块内存，直到类被卸载时，静态变量被摧毁，
    // 并释放所占有的内存。因此在某些特定条件下会`耗费内存`。
    //类的构造器私有化
    private Bank(){

    }
    //在类的内部创建当前类的实例,相当于是属性，声明为static
    private static Bank instance = new Bank();
    //使用getXxx()方法获取当前类的实例，必须声明为static
    public static Bank getInstance(){
        return instance;
    }
}
