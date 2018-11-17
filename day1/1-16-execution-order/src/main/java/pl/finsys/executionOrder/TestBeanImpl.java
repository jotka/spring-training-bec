package pl.finsys.executionOrder;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created with IntelliJ IDEA.
 * User: jaroslaw.krochmalski
 * Date: 03.07.13
 * Time: 12:44
 */
public class TestBeanImpl implements TestBean, InitializingBean, DisposableBean {

    private final static Logger logger = LoggerFactory.getLogger(TestBeanImpl.class.getName());

    public TestBeanImpl() {
        logger.info("constructor");
    }

    public void setSetterTest(String dummy) {
        logger.info("setters");
    }

    public void initMethod() {
        logger.info("init-method");
    }

    public void destroyMethod() {
        logger.info("destroy-method");
    }


    @PostConstruct
    public void initMethodAnnotated() {
        logger.info("@PostConstruct");
    }

    @PreDestroy
    public void destroyMethodAnnotated() {
        logger.info("@PreDestroy");
    }

    @Override
    public void destroy() throws Exception {
        logger.info("DisposableBean #destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("InitializingBean #afterPropertiesSet");
    }

    @Override
    public void aMethod() {
        setSetterTest("aaa");
    }
}
