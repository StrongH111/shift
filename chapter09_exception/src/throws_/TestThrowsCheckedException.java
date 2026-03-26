package throws_;

public class TestThrowsCheckedException {
    public static void main(String[] args) {
        System.out.println("上课...");
        try{
            afterClass();//换到这里处理
        }catch(InterruptedException e){
            e.printStackTrace();
            System.out.println("准备提前上课");
        }
        System.out.println("上课...");
    }
    public static void afterClass() throws InterruptedException{
        for (int i = 10; i >=1 ; i--) {
            Thread.sleep(1000);
            //本来应该在这处理异常，但被throws抛出去了
            System.out.println(i);
        }
    }
}
