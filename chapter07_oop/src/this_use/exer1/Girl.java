package this_use.exer1;

public class Girl {
    //成员变量
    private String name;
    private int age;
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
    public void marry(Boy boy){
        System.out.println("我想嫁给"+boy.getName());
        boy.marry(this);//this代表当前对象
      //boy.marry(new Girl())这里的girl就是另一个对象了
    }
    public int compare(Girl girl){//比较当前对象和形参对象的年龄大小
        if(this.age > girl.age) {
            return 1;
        }else{
            return -1;
        }


    }
}
