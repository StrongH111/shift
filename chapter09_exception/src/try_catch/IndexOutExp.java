package try_catch;

public class IndexOutExp {
    public static void main(String[] args) {
        String friends[] = {"lisa","bily","kessy"};
        try{
            for (int i = 0; i < 5; i++) {
                System.out.println(friends[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        try{
            int y= 2/0;
        }catch(ArithmeticException e){
            e.printStackTrace();

        }
    }
}
