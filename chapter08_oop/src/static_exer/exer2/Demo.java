package static_exer.exer2;

public class Demo {
    public static void main(String[] args) {
        Demo test = new Demo();
        test = null;
        test.hello();//"Hello"
    }
    public static void hello(){
        System.out.println("Hello");
    }
}
