public class DoWhileTest {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int number = 0;
        do{
            if( i%2 == 0){
                sum+=i;
                number++;
            }
            i++;
        }while(i <100);
        System.out.println("偶数的和为"+sum);
        System.out.println("偶数的个数为"+number);
    }
}
