public class ForTest1 {
    public static void main(String[] args) {
        //找出所有的水仙花数
        int num = 100;
        for(num = 100; num <= 999; num++) {
            if(num ==(num/100)*(num/100)*(num/100)+(num%100/10)*(num%100/10)*(num%100/10)+(num%10)*(num%10)*(num%10)){
                System.out.println(num);
            }

        }
    }
}
