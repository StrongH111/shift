public class ForTest {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("HelloWorld");
        }
        int num = 1;
        for (System.out.println("a"); num < 5; System.out.println("b"), num++) {
            System.out.println("c");
        }
        int sum = 0;
        int count = 0;
        //遍历100以内的偶数
        for (int j = 0; j < 100; j++) {
            if(j%2==0){
                sum +=j;
                count++;
            }
        }
        System.out.println(sum);
        System.out.println(count);
    }
}