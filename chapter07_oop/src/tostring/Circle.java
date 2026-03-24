package tostring;

public class Circle extends GeometricObject{
    private double radius;

    public Circle() {
        color = "white";
        weight = 1.0;
        radius = 1.0;
    }

    public Circle(double radius) {
        color = "white";
        weight = 1.0;
        this.radius = radius;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //计算圆的面积
    public double fondArea(){
        return Math.PI * radius *radius;
    }
    //重写equals方法判断两个圆的半径是否相等

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj instanceof Circle){
            Circle c = (Circle) obj;
            return this.radius == c.radius;
        }
        return false;
    }
    //重写tostring返回圆的半径

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius +'}';
       }
}
