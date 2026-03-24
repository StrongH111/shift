package main;

public class MainDemo {
    //可以用命令行参数赋值给main()方法
    public static void main(String[] args) {//普通的静态方法
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);

        }
    }
}
