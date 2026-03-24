package abstract_exer.exer1;

public class SalariedEmployee extends Employee{
    private double monthlySalary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }
    public double earnings(){
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + super.toString() +
                "monthlySalary=" + monthlySalary +
                '}';
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}
