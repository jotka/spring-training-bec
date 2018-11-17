package pl.finsys.setterExample;

public class OutputHelper {
	private IOutputGenerator outputGenerator;

	public void generateOutput() {
		outputGenerator.generateOutput();
	}

	//wstrzykniecie przez metode setter'a
	public void setOutputGenerator(IOutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
	}
}