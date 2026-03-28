import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class NumThread implements Callable {
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for(int i=0;i<100;i++){
            if(i%2 == 0){
                System.out.println(i);
                sum+=i;
            }
        }
        return sum;
    }
}
class CallableTest{
    public static void main(String[] args) {
        //创建Callable对象
        NumThread numThread = new NumThread();
//        将此Callable接口实现类的对象作为参数传递到Thread类的构造器中，创建Thread对象
        FutureTask futureTask = new FutureTask(numThread);
        //将FutureTask的对象作为参数传递到Thread类的构造器中，创建Thread对象
        Thread t1 = new Thread(futureTask);
        t1.start();

        try {
            Object sum = futureTask.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
