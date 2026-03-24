package equals_use.exer1;

public class OrderTest  {
    public static void main(String[] args) {
        Order o1 = new Order(1001, "Java");
        Order o2 = new Order(1002, "Java");
        System.out.println(o1.equals(o2));
    }
}
