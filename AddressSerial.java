package randomQuestions;

import java.io.Serializable;

public class AddressSerial implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	transient String street; 
	transient int street1; 
	String state; 
	String country; 
	String street2; 
	String city; 
	
	public String getCity() {
		return city; 
	}
	
	public void setCity(String city) {
		this.city = city; 
	}
	
	public String getState() {
		return state; 
	}

	@Override
	public String toString() {
		return "AddressSerial [street=" + street + ", street1=" + street1 + ", state=" + state + ", country=" + country
				+ ", street2=" + street2 + ", city=" + city + "]";
	}

	public void setStreet(String street) {
		this.street = street; 
	}

	public void setStreet2(String street22) {
		this.street2 = street22; 
	}

	public void setStreet1(int street1) {
		this.street1 =street1; 
	}

	public void setCountry(String country2) {
		this.country = country2; 
	}

	
	public void setState(String state2) {
		// TODO Auto-generated method stub
		this.state = state2; 
		
	}
	
   
	
	
}
