package pl.finsys.helloWorld;

/**
 * Spring bean
 * 
 */
public class HelloWorld {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void sayHello() {
		System.out.println(String.format("Spring : Hello %s!", name));
	}
}