package this_use.exer1;

public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy = new Boy("张三",23);
        Girl girl = new Girl();
        girl.setName("李四");
        girl.setAge(22);
        boy.shout();
        girl.marry(boy);
         girl.compare(girl);
    }
}
