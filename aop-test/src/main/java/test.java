import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by peter.xiao on 9/26/2018.
 */

public class test {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");

        Student student = (Student) context.getBean("student");

        student.getName();
        student.getAge();
    }
}
