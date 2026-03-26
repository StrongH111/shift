


import org.junit.jupiter.api.Test;

public class TestStackOverflowError {
    @Test
    public void test01(){
        //StackOverflowError
        recursion();
    }
    public void recursion(){
        //递归方法
        recursion();
    }
}

