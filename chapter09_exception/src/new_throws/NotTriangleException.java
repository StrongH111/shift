package new_throws;

public class NotTriangleException extends Exception{
    static final long serialVersionUID  =13465653435L;
    public NotTriangleException(){

    }
    public NotTriangleException(String message) {
        super(message);
    }
}
