package anonymous.exer1;

public interface C {
    void method ();
}
class Test2{
    public static void test2(C c){
        c.method();
    }
    public static void main(String[] args) {
        test2(new C(){
            @Override

        public void method(){
                System.out.println("匿名内部类的对象作实参");
            }


        });
    }
}
