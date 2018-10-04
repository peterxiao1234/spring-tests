import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by peter.xiao on 10/3/2018.
 */
@Configuration

public class ConfigHelloWorld4Java {
    @Bean
    public HelloWorld4Java hellowWorld() {
        return new HelloWorld4Java();
    }

}
