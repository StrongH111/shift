public class WhileTest {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println("hello world");
            i++;
        }

        int j = 0;
        int sum = 0;
        int count = 0;
        while (j <100) {
            if(j % 2 ==0)
            {
                sum += j;
                count++;
            }

            j++;
        }
        System.out.println(count);
        System.out.println(sum);

    }
}

