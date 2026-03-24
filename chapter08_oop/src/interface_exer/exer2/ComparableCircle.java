package interface_exer.exer2;

public class ComparableCircle extends Circle implements CompareObject{
    public ComparableCircle(double radius) {
        super(radius);
    }

    //先继承后实现
    @Override
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        }
        if (o instanceof ComparableCircle) {
            ComparableCircle c = (ComparableCircle) o;
            if(this.getRadius() > c.getRadius()){
                return 1;
            }else if(this.getRadius() < c.getRadius()){
                return -1;
            }else {
                return 0;
            }
        }
        return 0;
    }
}
