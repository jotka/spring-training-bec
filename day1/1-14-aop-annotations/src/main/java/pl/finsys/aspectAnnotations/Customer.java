package pl.finsys.aspectAnnotations;

public interface Customer {

	void addCustomer();
	
	String addCustomerReturnValue();
	
	void addCustomerThrowException() throws Exception;
	
	void addCustomerAround(String name);
}