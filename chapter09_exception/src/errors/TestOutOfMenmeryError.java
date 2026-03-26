import org.junit.jupiter.api.Test;

public class TestOutOfMenmeryError {
    @Test
    public void test02(){
        //OutOfMenertError
        int[] arr = new int[Integer.MAX_VALUE];

    }
    @Test
    public void tets03(){
        //OutOfMemeryError
        StringBuilder s = new StringBuilder();
        while(true){
            s.append("hello");
        }
    }
}
