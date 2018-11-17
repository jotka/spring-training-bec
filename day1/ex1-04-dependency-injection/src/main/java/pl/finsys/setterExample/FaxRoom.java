package pl.finsys.setterExample;

public class FaxRoom {
	private IFax fax;

	public int sendFax() {
		return fax.send();
	}

	//wstrzykniecie przez metode setter'a
	public void setFax(IFax fax) {
		this.fax = fax;
	}
}