package pl.finsys.beanscopes.services;

/**
 * @author jarek@finsys.pl
 */
public class ServiceTwoImpl implements ServiceTwo {
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
