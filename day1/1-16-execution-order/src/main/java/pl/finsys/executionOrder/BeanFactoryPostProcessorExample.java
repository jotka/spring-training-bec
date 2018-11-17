package pl.finsys.executionOrder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * Created with IntelliJ IDEA.
 * User: jaroslaw.krochmalski
 * Date: 03.07.13
 * Time: 12:37
 */
public class BeanFactoryPostProcessorExample implements BeanFactoryPostProcessor {
    private final static Logger logger = LoggerFactory.getLogger(BeanFactoryPostProcessorExample.class.getName());

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        logger.info("BeanFactoryPostProcessor#postProcessBeanFactory");
    }
}
