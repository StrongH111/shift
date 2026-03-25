package anonymous.exer1;

public interface A {
    void a();
}
//使用匿名内部类的对象直接调用方法
class Test{
    public static void main(String[] args) {

        new A(){
            @Override
            public void a(){
                System.out.println("匿名内部类");

            }
        }.a();
    }

}
