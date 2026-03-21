package extends_exer.exer2;

public class Cylinder extends Circle{
    private double length;
    //构造器
    //将length属性初始化为1
    public Cylinder() {
        this.length = 1;
    }
    //计算圆柱体积
    public double findVolume(){
        return findArea()*length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
class CylinderTest{
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.setRadius(3);
        System.out.println(c.findArea());
        c.setLength(2);
        System.out.println(c.findVolume());
    }
}
