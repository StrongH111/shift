package extends_exer.exer1;

public class Mankind {
    //成员变量
    private int sex;
    private int salary;
    //根据sex值显示man/women(1/0)
    public void manOrWomen(){
        if(sex == 1){
            System.out.println("man");
        }else if(sex == 0){
            System.out.println("women");
        }else{
            System.out.println("error");
        }
    }
    //根据salary的值显示no job/job(1/0)
    public void employeed(){
        if (salary == 0){
            System.out.println("no job");
        }else if(salary != 0 ){
            System.out.println("job");
        }else{
            System.out.println("error");
        }

    }
    //构造方法

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }


}
