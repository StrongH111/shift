//获取一个随机数Math.random()，返回值类型为double，范围[0.0,1.0)
//Math.random()*(b-a)+a;[a,b]
public class RandomTest {
    public static void main(String[] args) {
        double num = Math.random();
        System.out.println(num);
        //获取一个随机数[0,100)
        int num1 = (int)(Math.random()*100);
        System.out.println(num1);
        //获取一个随机数[0,100]
        int num2 = (int)(Math.random()*101);
        //获取一个随机数[1,100]
        int num3 = (int)(Math.random()*100)+1;
        System.out.println(num2);
        System.out.println(num3);
    }
}
