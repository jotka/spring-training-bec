package pl.finsys.aop;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HijackAroundMethod implements MethodInterceptor {
    private final static Logger logger = LoggerFactory.getLogger(HijackAroundMethod.class.getName());

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        logger.info("Method name : " + methodInvocation.getMethod().getName());

        logger.info("Method arguments : " + Arrays.toString(methodInvocation.getArguments()));

		// same with MethodBeforeAdvice
        logger.info("HijackAroundMethod : Before method hijacked!");

		try {
			// proceed to original method call
			Object result = methodInvocation.proceed();

			// same with AfterReturningAdvice
            logger.info("HijackAroundMethod : Before after hijacked!");

			return result;

		} catch (IllegalArgumentException e) {
			// same with ThrowsAdvice
            logger.info("HijackAroundMethod : Throw exception hijacked!");
			throw e;
		}
	}
}