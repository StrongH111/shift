package main;

public class MainTest {
    //main方法的两种理解
    //1.当作程序的入口，固定格式
    //2.当成普通的静态方法去调用
    public static void main(String[] args) {
        String[] arr = {"AA","BB","CC"};//程序的入口
        Main.main(arr);

    }


}
class Main{
    public static void main(String[] args) {//普通的静态方法
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);

        }
    }
}
