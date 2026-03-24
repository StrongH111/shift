package ploymorphism.exer4;

public class Woman extends Person{
    @Override
    public void eat() {
        System.out.println("Woman eat");
    }
    @Override
    public void toilet(){
        System.out.println("Woman toilet");
    }
    public void makeup(){
        System.out.println("Woman makeup");
    }
}
