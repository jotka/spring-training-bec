package pl.finsys.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingAspect {
    private final static Logger logger = LoggerFactory.getLogger(LoggingAspect.class.getName());

	public void logBefore(JoinPoint joinPoint) {

        logger.info("logBefore() is running!");
        logger.info("hijacked : " + joinPoint.getSignature().getName());
        logger.info("******");
	}

	public void logAfter(JoinPoint joinPoint) {

		logger.info("logAfter() is running!");
		logger.info("hijacked : " + joinPoint.getSignature().getName());
		logger.info("******");

	}
	
	public void logAfterReturning(JoinPoint joinPoint, Object result) {

		logger.info("logAfterReturning() is running!");
		logger.info("hijacked : " + joinPoint.getSignature().getName());
		logger.info("Method returned value is : " + result);
		logger.info("******");

	}
	
	public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {

		logger.info("logAfterThrowing() is running!");
		logger.info("hijacked : " + joinPoint.getSignature().getName());
		logger.info("Exception : " + error);
		logger.info("******");

	}
	
	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {

		logger.info("logAround() is running!");
		logger.info("hijacked method : " + joinPoint.getSignature().getName());
		logger.info("hijacked arguments : " + Arrays.toString(joinPoint.getArgs()));
		
		logger.info("Around before is running!");
		joinPoint.proceed();
		logger.info("Around after is running!");
		
		logger.info("******");

	}
	
}