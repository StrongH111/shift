package enum_exer.exer1;

public class Season {
    //jdk5之前定义枚举类
    //在类的内部创建枚举类的实例。声明为：`public static final` ，对外暴露这些常量对象
//  对象如果有`实例变量`，应该声明为`private final`（建议，不是必须），并在构造器中初始化
    private final String SEASONNAME;
    private final String SEASONDESC;
    private Season(String seasonName,String seasonDesc){
        this.SEASONNAME = seasonName;
        this.SEASONDESC = seasonDesc;
    }
    public static final Season SPRING = new Season("春天","春暖花开");
    public static final Season SUMMER = new Season("夏天","烈日炎炎");
    public static final Season AUTUMN = new Season("秋天","秋高气爽");
    public static final Season WINTER = new Season("冬天","冰天雪地");

    @Override
    public String toString() {
        return "Season{" +
                "SEASONNAME='" + SEASONNAME + '\'' +
                ", SEASONDESC='" + SEASONDESC + '\'' +
                '}';
    }
}
class Test{
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
    }
}
