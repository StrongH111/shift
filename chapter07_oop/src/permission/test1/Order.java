package permission.test1;

public class Order {
    //四种权限修饰符private 缺省 protected public
    private int orderPrivate;//私有:只能在当前类中访问
    int orderDefault;//默认省，在同一个包下可以访问
    protected int orderProtected;//保护的 :同一个包下可以访问，不同包下子类可以访问
    public int orderPublic;//公共的
    private void methodPrivate(){}//私有方法
    void methodDefault(){}//默认的方法
    protected void methodProtected(){}//受保护的
    public void methodPublic(){}//公共的方法

}
