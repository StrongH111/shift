package block.exer1;

public class User1 {
    private String userName;
    private String password;
    private long registratonTime;

    public User1() {
        userName = System.currentTimeMillis() +"";
        password = "123456";
    }

    public User1(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    //非静态代码块，把构造器中重复的内容单拎出来
    {
        System.out.println("新用户注册");
        registratonTime = System.currentTimeMillis();
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRegistratonTime(long registratonTime) {
        this.registratonTime = registratonTime;
    }
    public String getInfo(){
        return "用户名：" +userName +"密码"+ password +"注册时间：" + registratonTime;
    }
}
