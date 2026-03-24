package interface_exer.exer2;

public class CompareTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(2.3);
        ComparableCircle c2 = new ComparableCircle(5.3);
        if(c1.compareTo(c2) > 0){
            System.out.println("c1大");
        }else{
            System.out.println("c2大");
        }

    }
}
