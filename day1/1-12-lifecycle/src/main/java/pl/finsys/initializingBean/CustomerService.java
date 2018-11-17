package pl.finsys.initializingBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CustomerService implements InitializingBean, DisposableBean {
    private final static Logger logger = LoggerFactory.getLogger(CustomerService.class.getName());

	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		logger.info("InitializingBean, afterPropertiesSet : " + message);
	}

	@Override
	public void destroy() throws Exception {
		logger.info("DisposableBean, destroy()");
	}
}
