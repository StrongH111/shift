package interface_exer.exer3;

public class Test {
    public static void main(String[] args) {
        Developer deve = new Developer("阿里",43);
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[2] = new Car("奔驰","black");
        vehicles[0] = new Bycicle("捷安特自行车","black");
        vehicles[1] = new ElectricVehicle("雅迪电动车","white");
        for (int i = 0; i < vehicles.length; i++) {
            deve.takingVehicle(vehicles[i]);
        }


    }
}
