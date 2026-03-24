package ploymorphism.exer2;

public class GeometricTest {
    public void equalsArea(GeometricObject g1,GeometricObject g2){
        if(g1.findArea() ==g2.findArea()){
            System.out.println("面积相等");
        }else{
            System.out.println("面积不相等");
        }
    }
    public void displayGeometric(GeometricObject g){
        System.out.println("面积为：" + g.findArea());
    }

    public static void main(String[] args) {
        GeometricTest gt = new GeometricTest();
        Circle c1 = new Circle("red", 2.0, 5.0);
        Circle c2 = new Circle("blue", 3.0, 5.0);
        gt.equalsArea(c1,c2);
        //匿名对象
        gt.displayGeometric(new MyRectangle("red", 2.0, 5.0, 4.0));
        gt.equalsArea(c1,new MyRectangle("red", 2.0, 5.0, 4.0));

    }
}

