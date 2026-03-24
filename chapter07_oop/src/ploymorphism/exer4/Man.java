package ploymorphism.exer4;

public class Man extends Person {
    @Override
    public void eat() {
        System.out.println("Man eat");
    }
    @Override
    public void toilet(){
        System.out.println("Man toilet");
    }
    public void smoke(){
        System.out.println("Man smoke");
    }
}

