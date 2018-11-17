package pl.finsys.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomerImpl implements Customer {

    private final static Logger logger = LoggerFactory.getLogger(CustomerImpl.class.getName());

	public void addCustomer(){
		logger.info("addCustomer() is running ");
	}
	
	public String addCustomerReturnValue(){
        logger.info("addCustomerReturnValue() is running ");
		return "abc";
	}
	
	public void addCustomerThrowException() throws Exception {
        logger.info("addCustomerThrowException() is running ");
		throw new Exception("Generic Error");
	}
	
	public void addCustomerAround(String name){
        logger.info("addCustomerAround() is running, args : " + name);
	}
}