package block.exer1;

public class User {
    private String userName;
    private String password;
    private long registratonTime;

    public User() {
        System.out.println("新用户注册");
        registratonTime = System.currentTimeMillis();
        userName = System.currentTimeMillis() +"";
        password = "123456";
    }

    public User(String userName, String password) {
        System.out.println("新用户注册");
        registratonTime = System.currentTimeMillis();
        this.userName = userName;
        this.password = password;
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
