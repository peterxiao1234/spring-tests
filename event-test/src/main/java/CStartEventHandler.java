import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * Created by peter.xiao on 10/3/2018.
 */
public class CStartEventHandler
        implements ApplicationListener<ContextStartedEvent> {

    public void onApplicationEvent(ContextStartedEvent event) {
        System.out.println("ContextStartedEvent Received");
    }
}
