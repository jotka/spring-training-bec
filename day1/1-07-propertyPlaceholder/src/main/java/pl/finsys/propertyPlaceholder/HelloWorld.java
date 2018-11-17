package pl.finsys.propertyPlaceholder;


public class HelloWorld {

	private String prefixProp;

	private String suffixProp;

	public String getPrefixProp() {
		return prefixProp;
	}

	public void setPrefixProp(String prefixProp) {
		this.prefixProp = prefixProp;
	}

	public String getSuffixProp() {
		return suffixProp;
	}

	public void setSuffixProp(String suffixProp) {
		this.suffixProp = suffixProp;
	}

	public void sayHello(){
		System.out.println(prefixProp + "!");
	}
	
	public void sayGoodbye(){
		System.out.println(suffixProp + "!");
	}
}