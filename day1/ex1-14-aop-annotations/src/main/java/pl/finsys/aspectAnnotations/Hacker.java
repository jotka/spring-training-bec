package pl.finsys.aspectAnnotations;

public interface Hacker {

	void login();
	
	String getIPAddress();
	
	void capture() throws Exception;
	
	void damage(String database);
}