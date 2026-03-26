package methods;

import enum_exer.exer2.Week;

import java.util.Scanner;

public class TestEnumMethod {
    public static void main(String[] args) {
        //values()
        Week[] values =Week.values();//返回枚举类型的对象数组
        for (int i = 0; i < values.length; i++) {
            //ordinal()返回当前枚举常量的次序号，默认从0开始
            // name()
            System.out.println(values[i].ordinal() + 1 + "→" + values[i].name());
        }
            System.out.println("-------------------------------");
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入星期值：");
            int weekValue =sc.nextInt();
            Week week = values[weekValue -1];
            //toString()默认返回的是常量名（对象名），可以继续手动重写该方法！
            System.out.println(week);
            System.out.println("请输入星期名：");
            String weekName = sc.next();
            //valueof()可以把一个字符串转为对应的枚举类对象。要求字符串必须是枚举类对象的“名字”。如不是，会有运行时异常：IllegalArgumentException。
            week = Week.valueOf(weekName);
            System.out.println(week);
            sc.close();


    }
}
