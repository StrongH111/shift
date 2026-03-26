package exceptions;

public class ArrayTools {
//    ArrayIndexOfBoundsException数组角标越界异常
    public static int getElement(int arr[],int index){
        int element = arr[index];
        return element;
    }

}
class ExceptionDemo{
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3};
        System.out.println(arr[4]);
//      ArrayIndexOutOfBoundsException
    }
}

