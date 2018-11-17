package pl.finsys.executionOrder;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: jaroslaw.krochmalski
 * Date: 04.07.13
 * Time: 08:02
 */


@Aspect
public class MyAspect {
    private final static Logger logger = LoggerFactory.getLogger(MyAspect.class.getName());

    @Before("execution(void set*(*))")
    public void setterAdvice(JoinPoint jointPoint) {
        logger.info("AOP advice");
    }
}
