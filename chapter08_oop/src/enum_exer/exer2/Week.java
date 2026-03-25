package enum_exer.exer2;
//jdk5之后定义枚举类
//enum 枚举类名{
//      常量列表    //中间用逗号隔开
// }
public enum Week {
    MONDAY,TUESDAY ,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;;
}
class TestEnum{
    public static void main(String[] args) {
        Week mon1 = Week.MONDAY;
        System.out.println(mon1);
    }
}
