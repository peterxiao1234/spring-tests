import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * Created by peter.xiao on 10/3/2018.
 */
public class CStopEventHandler implements ApplicationListener<ContextStoppedEvent> {

        public void onApplicationEvent(ContextStoppedEvent event) {
            System.out.println("ContextStoppedEvent Received");
        }
}
