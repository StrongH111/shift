package ploymorphism.exer2;

public class Circle extends GeometricObject{
    private double radius;
    public Circle(String color, double weight, double radius) {
        super(color,weight);
        this.radius = radius;
    //  this.weight = weight;
    }
    public double findArea(){
        return Math.PI*radius*radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
