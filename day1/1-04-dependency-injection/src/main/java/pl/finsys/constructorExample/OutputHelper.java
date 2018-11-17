package pl.finsys.constructorExample;

public class OutputHelper {
	private final IOutputGenerator outputGenerator;

	public void generateOutput() {
		outputGenerator.generateOutput();
	}

	//wstrzykniecie przez konstruktor
	public OutputHelper(IOutputGenerator outputGenerator){
		this.outputGenerator = outputGenerator;
	}
	
}