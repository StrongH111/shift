package interface_exer.exer3;

public class Car extends Vehicle implements IPower {
    private String carNumber;

    public Car() {
    }

    public Car(String brand, String color, String carNumber) {
        super(brand, color);
        this.carNumber = carNumber;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public Car(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println(toString());
        power();

    }

    @Override
    public void power() {
        System.out.println("正在加油...");

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
