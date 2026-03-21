package extends_exer.exer1;

public class kids extends Mankind{
    private int yearsOld;
    //打印yearsOld的值
    public void printAge(){
        System.out.println(yearsOld);

    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }
}
class kidsTest{
    public static void main(String[] args) {
        kids someKid = new kids();
        someKid.setSex(1);
        someKid.setSalary(0);
        someKid.manOrWomen();
        someKid.employeed();
        someKid.setYearsOld(10);
        someKid.printAge();
    }
}
