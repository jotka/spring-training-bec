package pl.finsys.autowired.byType;

public class KungFu {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Kungfu [name=" + name + "]";
	}

}