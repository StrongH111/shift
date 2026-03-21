package super_exer1;

import overwrite.exer1.Mankind;

public class kids extends Mankind {
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
    //重写父类的方法
    @Override
    public void employeed(){
        super.employeed();
        System.out.println("kids should study and no job");
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
