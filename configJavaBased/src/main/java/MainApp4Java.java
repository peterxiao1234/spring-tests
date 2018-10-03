import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by peter.xiao on 10/3/2018.
 */
public class MainApp4Java {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigHelloWorld4Java.class);
        HelloWorld4Java helloWorld = context.getBean(HelloWorld4Java.class);
        helloWorld.setMessage("My hello world!!");
        System.out.println(helloWorld.getMessage());
    }

}
