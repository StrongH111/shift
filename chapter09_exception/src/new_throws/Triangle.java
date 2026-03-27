package new_throws;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) throws NotTriangleException{
        if(a <=0||b <=0||c <=0){
            throw new NotTriangleException("三角形的边长必须大于0");
        }
        if(a+b<=c||a+c<=b||b+c<=a){
            throw new NotTriangleException("三角形的两边之和必须大于第三边");
        }
        this.a = a;
        this.b = b;
        this.c = c;

    }
}
