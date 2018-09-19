package randomQuestions;

import java.io.*; 

class A implements Serializable {
 B b1 = new B();
  	
}

class B implements Serializable {
	C c1 = new C(); 
}

class C implements Serializable {
	int x = 15; 
}

public class ObjCr {
public static void main(String[] args) throws Exception{
	A a = new A(); 
	FileOutputStream fos = new FileOutputStream("abc.ser"); 
	ObjectOutputStream oos = new ObjectOutputStream(fos); 
	oos.writeObject(a);
	FileInputStream fis = new FileInputStream("abc.ser"); 
	ObjectInputStream ois = new ObjectInputStream(fis); 
	A a2 = (A)ois.readObject(); 
	//System.out.println(a2.b1.c1.x);
}
}
