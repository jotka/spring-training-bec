package pl.finsys.setterExample.impl;

import pl.finsys.setterExample.IOutputGenerator;

public class CsvOutputGenerator implements IOutputGenerator {
	public void generateOutput() {
		System.out.println("This is Csv Output Generator");
	}
}