package anonymous.exer1;

public interface B {
    void B();
}
class Test1{
    public static void main(String[] args) {
        A obj = new A(){
            @Override
            public void a(){
                System.out.println("通过父接口的变量多态引用匿名内部类");
            }
        };
        obj.a();
    }

}
