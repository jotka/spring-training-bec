package pl.finsys.beanscopes.services;

public class CustomerServiceImpl implements CustomerService {
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
