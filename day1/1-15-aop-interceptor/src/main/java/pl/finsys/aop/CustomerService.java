package pl.finsys.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomerService {
    private final static Logger logger = LoggerFactory.getLogger(CustomerService.class.getName());

	private String name;
	private String url;

	public void setName(String name) {
		this.name = name;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void printName() {
        logger.info("Customer name : " + this.name);
	}

	public void printURL() {
        logger.info("Customer website : " + this.url);
	}

	public void printThrowException() {
		throw new IllegalArgumentException();
	}

}