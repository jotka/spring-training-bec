package pl.finsys.aspect;

public class HackerImpl implements Hacker {

	public void login(){
		System.out.println("Hacker logging in.");
	}
	
	public String getIPAddress(){
		System.out.println("getIdAddress() is running ");
		return "10.10.22.11";
	}

	public void capture() throws Exception {
		System.out.println("hacker is captured! ");
		throw new Exception("hacker is captured!");
	}
	
	public void damage(String database){
		System.out.println("hacker is destroying database: " + database);
	}
}