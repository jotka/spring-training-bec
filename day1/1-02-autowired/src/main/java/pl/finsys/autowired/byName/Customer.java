package pl.finsys.autowired.byName;
 
public class Customer {
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [address=" + address + "]";
	}

}