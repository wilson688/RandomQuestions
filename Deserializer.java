package randomQuestions;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserializer {

	public static void main(String[] args) {
		Deserializer deserializer = new Deserializer(); 
		AddressSerial address = deserializer.deserializeAddress(); 
		System.out.println(address);
	}

	private AddressSerial deserializeAddress() {
		
		AddressSerial address; 
		try {
			FileInputStream fin = new FileInputStream("D:/address.ser"); 
			ObjectInputStream ois = new ObjectInputStream(fin); 
			address = (AddressSerial) ois.readObject(); 
			ois.close(); fin.close();
			return address; 
		} catch(Exception e) {
			e.printStackTrace(); 
			return null; 
		}
	}
	
}
