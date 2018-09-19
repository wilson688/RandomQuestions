package randomQuestions;

public class Address {
	int street; 
	String city; 
	String state; 
	
	

	public Address(int street, String city, String state) {
		this.street = street; 
		this.city = city; 
		this.state = state; 
	}
	
	@Override 
	public String toString() {
		return "Address [street= "+street+", city= "+city+", state= "+state+"]"; 
	}

}
