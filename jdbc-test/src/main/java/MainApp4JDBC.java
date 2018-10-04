import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by peter.xiao on 10/4/2018.
 */
public class MainApp4JDBC {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");
        System.out.println("--- record creating -----");
        studentJDBCTemplate.create("zera", 11);
        studentJDBCTemplate.create("Nuha", 2);
        studentJDBCTemplate.create("Ayka", 15);

        System.out.println("---- List multiple Records -----");
        List<Student> students = studentJDBCTemplate.listStudents();
        for (Student student : students) {
            System.out.println("ID: " + student.getId());
            System.out.println("Name:" + student.getName());
            System.out.println("Age:" + student.getAge());
        }

        System.out.println("-- update data --");
        studentJDBCTemplate.update(2,20);
        System.out.println("--- list the new infor ---");
        Student student = studentJDBCTemplate.getStudent(2);

        System.out.println(student.getId() + ":" + student.getName() + ":" + student.getAge());
    }
}
