package pl.finsys.autowired.byType;

public class Ping {
	private Pong pong;

	public Pong getPong() {
		return pong;
	}

	public void setPong(Pong pong) {
		System.out.println("autowiring by type");
		this.pong = pong;
	}

	@Override
	public String toString() {
		return "Ping [pong=" + pong+ "]";
	}

}