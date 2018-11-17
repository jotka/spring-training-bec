package pl.finsys.aop.advices;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.MethodBeforeAdvice;

public class HijackBeforeMethod implements MethodBeforeAdvice {
    private final static Logger logger = LoggerFactory.getLogger(HijackBeforeMethod.class.getName());

    @Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
        logger.info("HijackBeforeMethod : Before method");
	}
}