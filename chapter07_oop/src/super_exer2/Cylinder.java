package super_exer2;

import overwrite.exer2.Circle;

public class Cylinder extends Circle {
    private double length;
    //构造器
    //将length属性初始化为1
    public Cylinder() {
        this.length = 1;
    }
    //计算圆柱体积
    public double findVolume(){
       return Math.PI*getRadius()*getRadius()*length;
        //由于子类重写了父类的findArea方法，所以子类的findArea方法会调用子类的findArea方法
        //return findArea()*length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    //重写父类的方法,计算的表面积圆柱
    @Override
    public double findArea(){
        return 2 * Math.PI *getRadius()*getRadius()+length *2*Math.PI*getRadius();
    }
}
class CylinderTest{
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.setRadius(3);
        System.out.println(c.findArea());
        c.setLength(2);
        System.out.println(c.findVolume());
        System.out.println("=======================================");
        Circle circle = new Circle();
        circle.setRadius(3);
        circle.findArea();
        System.out.println(circle.findArea());
    }
}
