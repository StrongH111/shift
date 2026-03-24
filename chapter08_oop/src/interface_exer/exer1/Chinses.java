package interface_exer.exer1;

public class Chinses implements Eatable{
    //实现类用implemts 关键字,可以多实现
    //实现类要么声明为abstract类，要么重写所有的抽象方法

    @Override
    public void eat() {
        System.out.println("中国人用筷子吃饭");
    }
}
