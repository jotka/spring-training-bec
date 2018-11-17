package pl.finsys.aop.advices;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.AfterReturningAdvice;

public class HijackAfterMethod implements AfterReturningAdvice {
    private final static Logger logger = LoggerFactory.getLogger(HijackAfterMethod.class.getName());

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        logger.info("HijackAfterMethod : After method");
	}
}