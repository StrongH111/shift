import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringlocAnnotationTest {
    @Test
    public void testIocAnnotation(){
        //实例化容器
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    }
}
