package interface_exer.exer3;

public class Bycicle extends Vehicle {
    public Bycicle() {
    }

    public Bycicle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println(toString());

    }

    @Override
    public String toString() {
        return super.toString() ;
    }
}
