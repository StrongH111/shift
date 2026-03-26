package number;

public class Test {
public static void main(String[] args) {
//    基本数据类型转为字符串
    int a = 10;
    String Str = String.valueOf(a);
    String str  = a +  "";
//    字符串转为基本数据类型
    int c = Integer.parseInt("整数的字符串");
    double d = Double.parseDouble("小数的字符串");
    boolean b = Boolean.parseBoolean("true或false");

//    int c = Integer.valueOf("整数的字符串");
//    double d = Double.valueOf("小数的字符串");
//    boolean b = Boolean.valueOf("true或false");

}
}
