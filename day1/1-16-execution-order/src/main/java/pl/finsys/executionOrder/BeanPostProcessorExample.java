package pl.finsys.executionOrder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created with IntelliJ IDEA.
 * User: jaroslaw.krochmalski
 * Date: 03.07.13
 * Time: 13:04
 */
public class BeanPostProcessorExample implements BeanPostProcessor {
    private final static Logger logger = LoggerFactory.getLogger(BeanPostProcessorExample.class.getName());

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        logger.info("BeanPostProcessor#postProcessBeforeInitializations");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        logger.info("BeanPostProcessor#postProcessAfterInitialization");
        return bean;
    }
}
