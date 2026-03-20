package this_use.exer1;

public class Boy {
    //成员变量
    private String name;
    private int age;
    //构造器
    public Boy(){

    }
    public Boy(String name){
        this.name = name;

    }
    public Boy(String name,int age){
        this.name = name;
        this.age = age;
    }
    //get\set方法访问属性
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void marry(Girl girl){
        System.out.println("我想娶"+girl.getName());
    }
    public void shout(){
        if(age >22){
            System.out.println("太棒了，我可以结婚了");
        }else{
            System.out.println("只能多谈恋爱了");
        }

    }
}
