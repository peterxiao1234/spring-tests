import org.springframework.context.ApplicationEvent;

/**
 * Created by peter.xiao on 10/3/2018.
 */
public class CustomEvent extends ApplicationEvent {
    public CustomEvent(Object source) {
        super(source);
    }
    public String toString(){
        return "My custom event!";
    }

}
