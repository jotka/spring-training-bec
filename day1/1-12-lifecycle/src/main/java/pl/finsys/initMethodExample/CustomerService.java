package pl.finsys.initMethodExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomerService {
    private final static Logger logger = LoggerFactory.getLogger(CustomerService.class.getName());

	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void initIt() throws Exception {
		logger.info("Init method after properties are set : " + message);
	}
	
	public void cleanUp() throws Exception {
        logger.info("Spring Container is destroyed! Customer clean up");
	}
	
}
