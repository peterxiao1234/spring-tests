import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by peter.xiao on 10/3/2018.
 */
public class EventMainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");

        // Let us raise a start event.
        context.start();

        EventHelloWorld obj = (EventHelloWorld) context.getBean("helloWorld");
        obj.getMessage();

        // Let us raise a stop event.
        context.stop();
    }
}
