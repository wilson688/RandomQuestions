package randomQuestions;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializer {

	public static void main(String[] args) {
		Serializer serializer = new Serializer(); 
		serializer.serializeAddress("Transient", 1234, "wall street", "BethelPark","PA",  "USA"); 
	}

	public void serializeAddress(String street, int street1, String street2, String city, String state, String country) {
		AddressSerial address = new AddressSerial(); 
		address.setStreet(street);
		address.setStreet1(street1); 
		address.setStreet2(street2);
		address.setCountry(country); 
		address.setState(state); 
		address.setCity(city);
		try {
		FileOutputStream fout = new FileOutputStream("D:\\address.ser"); 
		ObjectOutputStream oos = new ObjectOutputStream(fout); 
		oos.writeObject(address);
		oos.close(); 
		fout.close(); 
		System.out.println("Done");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
