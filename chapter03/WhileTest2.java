public class WhileTest2 {
    public static void main(String[] args) {
        //珠峰的高度
        double high = 8848.86;
        //纸的厚度
        double i = 0.1;
        //折的次数
        int count = 0;
        while(i < 8848.86*1000){
            i *= 2;
            System.out.println(i);
            count++;
        }
        System.out.println("折了"+count+"次");
    }
}
