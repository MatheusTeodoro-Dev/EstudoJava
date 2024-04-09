package entities;

public class Rent {

	private String name;
	private String email;
	
	public Rent (String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public Rent() {
		
	}
	
	 public String toString() {
	       return String.format("%s, %s", name, email);
	    }
}
