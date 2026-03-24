package block.exer1;

public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();
        User u2  =new User("张三","2345678");
        System.out.println(u1.getInfo());
        System.out.println(u2.getInfo());

        User1 u3 = new User1();
        User1 u4 = new User1("李四","3534");
    }
}
