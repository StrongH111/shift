package interface_exer.exer3;

public class ElectricVehicle extends Vehicle implements IPower{
    public ElectricVehicle() {
    }

    public ElectricVehicle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println(toString());
        power();
    }

    @Override
    public void power() {
        System.out.println("正在充电...");

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
