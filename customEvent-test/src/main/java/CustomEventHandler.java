import org.springframework.context.ApplicationListener;

/**
 * Created by peter.xiao on 10/3/2018.
 */
public class CustomEventHandler implements ApplicationListener<CustomEvent>{

    public void onApplicationEvent(CustomEvent customEvent) {
        System.out.println(customEvent.toString()+": 4444");
    }
}
