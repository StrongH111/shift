package super_exer2;

public class Circle {
    private double radius;

    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    //计算圆的面积
    public double findArea(){
        return Math.PI *radius*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
