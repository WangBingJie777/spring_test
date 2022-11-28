package test;

import bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wbj
 * @create 2022-11-24 22:59
 */
public class Test1 {
    @Test
    public void test(){
        //1. 加载xml配置文件
        ApplicationContext ioc = new ClassPathXmlApplicationContext("application.xml");
        Student student = ioc.getBean(Student.class);
        System.out.println(student);
        /**
         * 结果：Student{name='zhangsan', age=20, school=School{name='北京大学', address='北京'}}
         *  说明，成功完成了属性的注入
         */
    }
}
