package number;
//自定义包装类
public class MyInteger {
    int value;

    public MyInteger() {
    }

    public MyInteger(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
/*    装箱
    Integer obj1 = new Integer(4);
    Float f = new Float("4.56");
    Long l = new Long("asdf") ;
    //NumberFormatException
      Integer obj2 = Integer.valueOf(4)
    //使用包装类中的valueOf
     拆箱
     Integer obj = new Integer(4);
     int num1 = obj.intValue()*/
/*//    自动装箱（仅限对应类型）
    Integer i = 4;//Double d = 1;// ×
    //相当于Integer i = Integer.valueOf(4);
    i =  i+1;
    //将i对象转成基本数值(自动拆箱) i.intValue() + 5;*/
}
