package pl.finsys.autowired.byType;

public class Pong {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pong [name=" + name + "]";
	}

}