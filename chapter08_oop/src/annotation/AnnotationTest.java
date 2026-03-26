package annotation;

import java.sql.SQLOutput;
import java.util.Spliterator;

public class AnnotationTest {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
                int a = 10;
    }
    @Deprecated
    public void print(){
        System.out.println("过时的");
    }

    @Override
    public String toString() {
        return "重写toString方法";
    }
}
