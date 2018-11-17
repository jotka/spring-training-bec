package pl.finsys.constructorExample;

public class PrintRoom {
	private final IPrinter printer;

	public String print() {
		return printer.print();
	}

	//wstrzykniecie przez konstruktor
	public PrintRoom(IPrinter printer){
		this.printer = printer;
	}
	
}