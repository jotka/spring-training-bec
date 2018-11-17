package pl.finsys.propertyPlaceholder;

public class Robot {

	private String hi;

	private String bye;

    public String getHi() {
        return hi;
    }

    public void setHi(String hi) {
        this.hi = hi;
    }

    public String getBye() {
        return bye;
    }

    public void setBye(String bye) {
        this.bye = bye;
    }

    public String sayHello(){
		return hi + ", Human!";
	}
	
	public String sayGoodbye(){
        return bye + ", Human!";
	}
}