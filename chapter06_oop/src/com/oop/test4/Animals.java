package com.oop.test4;

public class Animals {
/* 直接调用属性legs，是不能加入判断逻辑的。那怎么办呢?>将legs属性私有化(private)，禁止在Animal类的外部直接调用此属性将此方法暴露出去，使得在Animal类的外部调用此方法，对legs属性赋值。
 在题目中，我们给Animal的对象的legs属性赋值。在实际的常识中，我们知道legs不能赋值为负数的。但是如果
>提供给legs属性赋值的setLegs()方法，在此方法中加入legs赋值的判断逻辑if(Legs >= 0 && legs %2 ==0)
>提供给legs属性获取的getLegs()方法，此方法对外暴露。使得在Animal类的外部还可以调用此属性的值。*/
    //权限修饰符：privte 缺省 protected public
    //java的封装性体现在，Java规定了四种权限修饰符，private、缺省、protected、public
    //我们可以用这四种权限修饰符来修饰类和类的内部成员当它们被调用时体现其可见性的大小

    //用private修饰的属性，只能在当前类中访问
    private String name;
    private int legs;
    //用方法来给private属性赋值
    public void setLegs(int l){
        if(legs >= 0 && legs %2 ==0){
            legs =l;
        }else{
            System.out.println("您输入的信息有误");
        }
    }
    //用方法来获取private属性的值
    public int getLegs(){
        return legs;
    }


    public static void main(String[] args) {
        Animals anima = new Animals();
        anima.name = "金蟾";
        //调用setLegs()方法，给legs属性赋值
        anima.setLegs(4);
        System.out.println(anima.getLegs());
/*        anima.legs = -4;//这样赋值并不会报错，但这样不符合常理*/
    }
}
