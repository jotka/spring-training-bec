package pl.finsys.aop.advices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.ThrowsAdvice;

public class HijackThrowException implements ThrowsAdvice {
    private final static Logger logger = LoggerFactory.getLogger(HijackThrowException.class.getName());

	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		logger.info("HijackThrowException : Throw exception");
	}
}