package annotation;

import java.lang.annotation.*;


//自定义注解
@Inherited//注解可以被继承
@Target(ElementType.TYPE)//用于描述注解的使用范围
@Retention(RetentionPolicy.RUNTIME)//注解的生命周期
public @interface Table {
    String value();
}
