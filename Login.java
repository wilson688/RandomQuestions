package randomQuestions;

import java.io.*; 

public class Login implements Serializable {
 String username="sowmya"; 
 String pwd = "wilson"; 
 String epwd; 
 int pin = 3457; 
 
 private void writeObject(ObjectOutputStream oos) throws Exception {
	 oos.defaultWriteObject(); 
	 epwd ="1@3"+pwd; 
	 int epin = 7777+pin; 
	 oos.writeObject(epwd); 
	 oos.writeInt(epin); 
 }
 
 private void readObject(ObjectInputStream ois) throws Exception {
	 ois.defaultReadObject();
	 String epwd = (String) ois.readObject(); 
	 pwd = epwd.substring(3); 
	 int epin = ois.readInt(); 
	 pin  = epin-7777; 
 }
}
