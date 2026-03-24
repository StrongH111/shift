package ploymorphism.exer2;

public class GeometricObject {
    private String color;
    private double weight;
    //构造器

    public GeometricObject() {
    }

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }
    //求面积
    public double findArea(){
        return 0.0;
    }
    //get\set方法

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
