import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by peter.xiao on 9/27/2018.
 */
@Aspect
public class Loggings {
    @Pointcut("execution(* *.*(..))")
    private void selectAll(){}

    /**
     * This is the method which I would like to execute
     * before a selected method execution.
     */
    @Before("selectAll()")
    public void beforeAdvice(){
        System.out.println("Going to setup student profile.");
    }
}
