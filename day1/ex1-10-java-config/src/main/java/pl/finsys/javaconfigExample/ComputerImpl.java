package pl.finsys.javaconfigExample;

public class ComputerImpl implements Computer {

	@Override
	public String execute(String msg) {

		return String.format("executing: %s!", msg);
	}

}